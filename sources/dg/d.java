package dg;

import a3.u;
import j$.util.List;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.zip.CRC32;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d {
    public static void a(TLRPC.GroupCall groupCall, TLRPC.GroupCall groupCall2) {
        if ((groupCall2 instanceof TLRPC.TL_groupCall) && (groupCall instanceof TLRPC.TL_groupCall)) {
            TLRPC.TL_groupCall tL_groupCall = (TLRPC.TL_groupCall) groupCall2;
            if (tL_groupCall.min) {
                TLRPC.TL_groupCall tL_groupCall2 = (TLRPC.TL_groupCall) groupCall;
                tL_groupCall.can_change_join_muted = tL_groupCall2.can_change_join_muted;
                tL_groupCall.can_start_video = tL_groupCall2.can_start_video;
                tL_groupCall.creator = tL_groupCall2.creator;
                tL_groupCall.can_change_messages_enabled = tL_groupCall2.can_change_messages_enabled;
            }
        }
    }

    public static void b(TLRPC.Poll poll, long j10) {
        if (poll == null) {
            return;
        }
        int size = poll.answers.size();
        for (int i3 = 0; i3 < size; i3++) {
            poll.answers.get(i3).unshuffled_index = i3;
        }
        if (poll.creator || !poll.shuffle_answers) {
            return;
        }
        CRC32 crc32 = new CRC32();
        int size2 = poll.answers.size();
        for (int i10 = 0; i10 < size2; i10++) {
            TLRPC.PollAnswer pollAnswer = poll.answers.get(i10);
            if (pollAnswer.option != null) {
                crc32.reset();
                String l10 = Long.toString(j10);
                Charset charset = StandardCharsets.UTF_8;
                crc32.update(l10.getBytes(charset));
                crc32.update(pollAnswer.option);
                crc32.update(Long.toString(poll.id).getBytes(charset));
                pollAnswer.shuffle_hash = crc32.getValue();
            }
        }
        ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(poll.answers);
        poll.shuffled_answers = arrayList;
        List.-EL.sort(arrayList, new u(6));
    }

    public static ArrayList c(Class cls, java.util.List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object obj : list) {
                if (cls.isInstance(obj)) {
                    arrayList.add(cls.cast(obj));
                }
            }
        }
        return arrayList;
    }

    public static Object d(ArrayList arrayList, Class cls) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public static TLRPC.Document e(TL_stars.StarGift starGift) {
        TLRPC.Document document = starGift.sticker;
        ArrayList<TL_stars.StarGiftAttribute> arrayList = starGift.attributes;
        if (arrayList != null && document == null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i3);
                i3++;
                TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
                if (starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel) {
                    return ((TL_stars.starGiftAttributeModel) starGiftAttribute2).document;
                }
            }
        }
        return document;
    }

    public static String f(TLRPC.ChatTheme chatTheme) {
        if (chatTheme instanceof TLRPC.TL_chatTheme) {
            return ((TLRPC.TL_chatTheme) chatTheme).emoticon;
        }
        if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
            return ((TLRPC.TL_chatThemeUniqueGift) chatTheme).gift.title;
        }
        return null;
    }

    public static boolean g(Object obj, Class... clsArr) {
        if (obj != null) {
            for (Class cls : clsArr) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static TLRPC.InputMedia h(TLRPC.MessageMedia messageMedia) {
        TLRPC.InputMedia tL_inputMediaGeoPoint;
        if (messageMedia instanceof TLRPC.TL_messageMediaVenue) {
            tL_inputMediaGeoPoint = new TLRPC.TL_inputMediaVenue();
            tL_inputMediaGeoPoint.address = messageMedia.address;
            tL_inputMediaGeoPoint.title = messageMedia.title;
            tL_inputMediaGeoPoint.provider = messageMedia.provider;
            tL_inputMediaGeoPoint.venue_id = messageMedia.venue_id;
            tL_inputMediaGeoPoint.venue_type = "";
        } else if (messageMedia instanceof TLRPC.TL_messageMediaGeoLive) {
            tL_inputMediaGeoPoint = new TLRPC.TL_inputMediaGeoLive();
            tL_inputMediaGeoPoint.period = messageMedia.period;
            int i3 = tL_inputMediaGeoPoint.flags;
            tL_inputMediaGeoPoint.flags = i3 | 2;
            int i10 = messageMedia.heading;
            if (i10 != 0) {
                tL_inputMediaGeoPoint.heading = i10;
                tL_inputMediaGeoPoint.flags = i3 | 6;
            }
            int i11 = messageMedia.proximity_notification_radius;
            if (i11 != 0) {
                tL_inputMediaGeoPoint.proximity_notification_radius = i11;
                tL_inputMediaGeoPoint.flags |= 8;
            }
        } else {
            tL_inputMediaGeoPoint = new TLRPC.TL_inputMediaGeoPoint();
        }
        TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
        tL_inputMediaGeoPoint.geo_point = tL_inputGeoPoint;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        tL_inputGeoPoint.lat = geoPoint.lat;
        tL_inputGeoPoint._long = geoPoint._long;
        return tL_inputMediaGeoPoint;
    }

    public static void i(String str, ArrayList arrayList) {
        int i3;
        int i10;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        t0.m();
        int length = str != null ? str.length() : 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TLRPC.MessageEntity messageEntity = (TLRPC.MessageEntity) arrayList.get(i11);
            if (messageEntity == null || (i3 = messageEntity.offset) < 0 || i3 > length || (i10 = messageEntity.length) <= 0 || i10 > length - i3) {
                arrayList.clear();
                return;
            }
        }
    }
}
