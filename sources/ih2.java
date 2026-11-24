// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ih2 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public j5 d;
    public Paint e;
    public RectF f;
    public vh6 g;
    public vh6 h;
    public boolean i;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.i) {
            return 1;
        }
        return this.a.size() + 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:117|(1:119)(2:128|(1:130)(9:131|(1:133)(1:135)|134|121|122|123|124|99|100))|120|121|122|123|124|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03dd, code lost:
    
        fc4.g(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x028e, code lost:
    
        if ((r0 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05af  */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i) {
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.FileLocation fileLocation;
        String str;
        TLRPC.FileLocation fileLocation2;
        TLRPC.ChatPhoto chatPhoto;
        boolean z;
        Bitmap decodeFile;
        k47 k47Var;
        TLRPC.Dialog dialog;
        int i2;
        int i3;
        int i4;
        TLRPC.Chat L0;
        TLRPC.User user2;
        CharSequence charSequence;
        SpannableStringBuilder valueOf;
        char c;
        char c2;
        String charSequence2;
        char c3;
        char c4;
        SpannableStringBuilder spannableStringBuilder;
        CharSequence charSequence3;
        CharSequence charSequence4;
        pc0 pc0Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        ArrayList arrayList = this.a;
        Context context = this.b;
        j5 j5Var = this.d;
        if (this.i) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, jb6.M0(2131742537, null));
            return remoteViews;
        }
        if (i >= arrayList.size()) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, jb6.M0(2131743942, null));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.c);
            bundle.putInt("appWidgetType", 0);
            bundle.putInt("currentAccount", j5Var.a);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        Long l = (Long) arrayList.get(i);
        CharSequence charSequence5 = "";
        if (pg3.D(l.longValue())) {
            user = oc7.r1(j5Var.a).W1(l);
            if (user != null) {
                str = m9c.D(user) ? jb6.M0(2131745635, null) : m9c.B(user) ? jb6.M0(2131745999, null) : m9c.z(user) ? jb6.M0(2131749085, null) : bw2.m(0, user.first_name, user.last_name);
                if (m9c.B(user) || m9c.D(user) || (userProfilePhoto = user.photo) == null || (fileLocation = userProfilePhoto.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                    chat = null;
                    fileLocation = null;
                } else {
                    chat = null;
                }
            } else {
                chat = null;
                fileLocation = null;
                str = "";
            }
        } else {
            int i5 = j5Var.a;
            int i6 = j5Var.a;
            TLRPC.Chat L02 = oc7.r1(i5).L0(Long.valueOf(-l.longValue()));
            if (L02 != null) {
                if (sd2.p0(L02)) {
                    String j = no4.j(i6, L02, false);
                    TLRPC.Chat L03 = oc7.r1(i6).L0(Long.valueOf(L02.linked_monoforum_id));
                    if (L03 == null || (chatPhoto = L03.photo) == null || (fileLocation2 = chatPhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        fileLocation2 = null;
                    }
                    fileLocation = fileLocation2;
                    str = j;
                } else {
                    str = L02.title;
                    TLRPC.ChatPhoto chatPhoto2 = L02.photo;
                    if (chatPhoto2 == null || (fileLocation = chatPhoto2.photo_small) == null || fileLocation.volume_id == 0 || fileLocation.local_id == 0) {
                        chat = L02;
                        user = null;
                        fileLocation = null;
                    }
                }
                chat = L02;
                user = null;
            } else {
                chat = L02;
                user = null;
                fileLocation = null;
                str = "";
            }
        }
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.shortcut_widget_item);
        remoteViews3.setTextViewText(R.id.shortcut_widget_item_text, str);
        if (fileLocation != null) {
            try {
                bc4.G(z8c.t0);
                decodeFile = BitmapFactory.decodeFile(bc4.J(fileLocation, null, true, true).toString());
            } catch (Throwable th) {
                th = th;
                z = true;
                fc4.g(th, z);
                k47Var = (k47) this.h.f(l.longValue());
                dialog = (TLRPC.Dialog) this.g.f(l.longValue());
                if (k47Var != null) {
                }
                if (dialog != null) {
                }
                i3 = 0;
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
                Bundle bundle2 = new Bundle();
                if (pg3.D(l.longValue())) {
                }
                bundle2.putInt("currentAccount", j5Var.a);
                Intent intent2 = new Intent();
                intent2.putExtras(bundle2);
                remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent2);
                remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : i3);
                return remoteViews3;
            }
        } else {
            decodeFile = null;
        }
        try {
            int L = gm.L(48.0f);
            Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(0);
            Canvas canvas = new Canvas(createBitmap);
            if (decodeFile == null) {
                if (user != null) {
                    pc0Var = new pc0(0, user);
                    if (m9c.B(user)) {
                        pc0Var.f(12);
                    } else if (m9c.D(user)) {
                        pc0Var.f(1);
                    }
                } else {
                    pc0Var = new pc0((ylb) null);
                    int i7 = j5Var.a;
                    pc0Var.p(chat);
                }
                pc0Var.setBounds(0, 0, L, L);
                pc0Var.draw(canvas);
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                if (this.e == null) {
                    this.e = new Paint(1);
                    this.f = new RectF();
                }
                float width = L / decodeFile.getWidth();
                canvas.save();
                canvas.scale(width, width);
                this.e.setShader(bitmapShader);
                this.f.set(0.0f, 0.0f, decodeFile.getWidth(), decodeFile.getHeight());
                canvas.drawRoundRect(this.f, decodeFile.getWidth(), decodeFile.getHeight(), this.e);
                canvas.restore();
            }
            canvas.setBitmap(null);
            remoteViews3.setImageViewBitmap(R.id.shortcut_widget_item_avatar, createBitmap);
        } catch (Throwable th2) {
            th = th2;
            z = true;
            fc4.g(th, z);
            k47Var = (k47) this.h.f(l.longValue());
            dialog = (TLRPC.Dialog) this.g.f(l.longValue());
            if (k47Var != null) {
            }
            if (dialog != null) {
            }
            i3 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
            Bundle bundle22 = new Bundle();
            if (pg3.D(l.longValue())) {
            }
            bundle22.putInt("currentAccount", j5Var.a);
            Intent intent22 = new Intent();
            intent22.putExtras(bundle22);
            remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent22);
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : i3);
            return remoteViews3;
        }
        k47Var = (k47) this.h.f(l.longValue());
        dialog = (TLRPC.Dialog) this.g.f(l.longValue());
        if (k47Var != null) {
            long Z0 = k47Var.Z0();
            if (pg3.D(Z0)) {
                user2 = oc7.r1(j5Var.a).W1(Long.valueOf(Z0));
                L0 = null;
            } else {
                L0 = oc7.r1(j5Var.a).L0(Long.valueOf(-Z0));
                user2 = null;
            }
            int color = context.getResources().getColor(R.color.widget_text);
            if (k47Var.k instanceof TLRPC.TL_messageService) {
                if (sd2.T(chat)) {
                    TLRPC.MessageAction messageAction = k47Var.k.action;
                    charSequence4 = charSequence5;
                    if (!(messageAction instanceof TLRPC.TL_messageActionHistoryClear)) {
                        charSequence4 = charSequence5;
                    }
                    color = context.getResources().getColor(R.color.widget_action_text);
                    charSequence3 = charSequence4;
                }
                charSequence4 = k47Var.v;
                color = context.getResources().getColor(R.color.widget_action_text);
                charSequence3 = charSequence4;
            } else {
                String str2 = "🎧 ";
                if (chat == null || L0 != null || (sd2.T(chat) && !sd2.n0(chat))) {
                    TLRPC.Message message = k47Var.k;
                    TLRPC.MessageMedia messageMedia = message.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (messageMedia.photo instanceof TLRPC.TL_photoEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = jb6.M0(2131753912, null);
                    } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (messageMedia.document instanceof TLRPC.TL_documentEmpty) && messageMedia.ttl_seconds != 0) {
                        charSequence3 = jb6.M0(2131753897, null);
                    } else if (k47Var.z != null) {
                        if (k47.K4(message)) {
                            str2 = "📹 ";
                        } else if (k47.Q4(k47Var.k)) {
                            str2 = "🎤 ";
                        } else if (!k47Var.I3()) {
                            str2 = k47.R3(k47Var.k) ? "🖼 " : "📎 ";
                        }
                        charSequence3 = str2 + ((Object) k47Var.z);
                    } else {
                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                            charSequence = "📊 " + ((TLRPC.TL_messageMediaPoll) messageMedia).poll.question.text;
                        } else if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            charSequence = "🎮 " + k47Var.k.media.game.title;
                        } else if (k47Var.D == 14) {
                            charSequence = td4.r("🎧 ", k47Var.w1(true), " - ", k47Var.y1(true));
                        } else {
                            charSequence = k47Var.v;
                            gm.v1(charSequence, k47Var.a2, null);
                        }
                        CharSequence charSequence6 = charSequence;
                        charSequence3 = charSequence6;
                        if (k47Var.k.media != null) {
                            charSequence3 = charSequence6;
                            if (!k47Var.F3()) {
                                color = context.getResources().getColor(R.color.widget_action_text);
                                charSequence3 = charSequence6;
                            }
                        }
                    }
                } else {
                    String M0 = k47Var.O3() ? jb6.M0(2131750436, null) : user2 != null ? m9c.k(user2, true).replace("\n", "") : "DELETED";
                    CharSequence charSequence7 = k47Var.z;
                    try {
                        if (charSequence7 != null) {
                            String charSequence8 = charSequence7.toString();
                            if (charSequence8.length() > 150) {
                                charSequence8 = charSequence8.substring(0, nm7.f2);
                            }
                            if (k47.K4(k47Var.k)) {
                                str2 = "📹 ";
                            } else if (k47.Q4(k47Var.k)) {
                                str2 = "🎤 ";
                            } else if (!k47Var.I3()) {
                                str2 = k47.R3(k47Var.k) ? "🖼 " : "📎 ";
                            }
                            valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", str2 + charSequence8.replace('\n', ' '), M0));
                        } else if (k47Var.k.media == null || k47Var.F3()) {
                            String str3 = k47Var.k.message;
                            if (str3 != null) {
                                if (str3.length() > 150) {
                                    c = 0;
                                    str3 = str3.substring(0, nm7.f2);
                                } else {
                                    c = 0;
                                }
                                Object[] objArr = new Object[2];
                                objArr[c] = str3.replace('\n', ' ').trim();
                                objArr[1] = M0;
                                valueOf = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr));
                            } else {
                                valueOf = SpannableStringBuilder.valueOf("");
                            }
                        } else {
                            color = context.getResources().getColor(R.color.widget_action_text);
                            TLRPC.MessageMedia messageMedia2 = k47Var.k.media;
                            if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                charSequence2 = kt6.o("📊 \u2068", ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.question.text, "\u2069");
                            } else if (messageMedia2 instanceof TLRPC.TL_messageMediaGame) {
                                charSequence2 = kt6.o("🎮 \u2068", messageMedia2.game.title, "\u2069");
                            } else {
                                if (k47Var.D == 14) {
                                    c2 = 1;
                                    charSequence2 = b10.i("🎧 \u2068", k47Var.w1(true), " - ", k47Var.y1(true), "\u2069");
                                } else {
                                    c2 = 1;
                                    charSequence2 = k47Var.v.toString();
                                }
                                c3 = ' ';
                                c4 = '\n';
                                String replace = charSequence2.replace(c4, c3);
                                Object[] objArr2 = new Object[2];
                                objArr2[0] = replace;
                                objArr2[c2] = M0;
                                SpannableStringBuilder valueOf2 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr2));
                                valueOf2.setSpan(new do4(cmb.n9, null), M0.length() + 2, valueOf2.length(), 33);
                                spannableStringBuilder = valueOf2;
                                spannableStringBuilder.setSpan(new do4(cmb.j9, null), 0, M0.length() + 1, 33);
                                charSequence3 = spannableStringBuilder;
                            }
                            c3 = ' ';
                            c4 = '\n';
                            c2 = 1;
                            String replace2 = charSequence2.replace(c4, c3);
                            Object[] objArr22 = new Object[2];
                            objArr22[0] = replace2;
                            objArr22[c2] = M0;
                            SpannableStringBuilder valueOf22 = SpannableStringBuilder.valueOf(String.format("%2$s: \u2068%1$s\u2069", objArr22));
                            valueOf22.setSpan(new do4(cmb.n9, null), M0.length() + 2, valueOf22.length(), 33);
                            spannableStringBuilder = valueOf22;
                            spannableStringBuilder.setSpan(new do4(cmb.j9, null), 0, M0.length() + 1, 33);
                            charSequence3 = spannableStringBuilder;
                        }
                        spannableStringBuilder.setSpan(new do4(cmb.j9, null), 0, M0.length() + 1, 33);
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        charSequence3 = spannableStringBuilder;
                    }
                    spannableStringBuilder = valueOf;
                }
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, jb6.e1(k47Var.k.date));
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, charSequence3.toString());
            remoteViews3.setTextColor(R.id.shortcut_widget_item_message, color);
        } else {
            if (dialog == null || (i2 = dialog.last_message_date) == 0) {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, "");
            } else {
                remoteViews3.setTextViewText(R.id.shortcut_widget_item_time, jb6.e1(i2));
            }
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_message, "");
        }
        if (dialog != null || (i4 = dialog.unread_count) <= 0) {
            i3 = 0;
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 8);
        } else {
            i3 = 0;
            remoteViews3.setTextViewText(R.id.shortcut_widget_item_badge, String.format("%d", Integer.valueOf(i4)));
            remoteViews3.setViewVisibility(R.id.shortcut_widget_item_badge, 0);
            if (oc7.r1(j5Var.a).o2(dialog.id, 0L, null)) {
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_muted_background);
            } else {
                remoteViews3.setInt(R.id.shortcut_widget_item_badge, "setBackgroundResource", R.drawable.widget_badge_background);
            }
        }
        Bundle bundle222 = new Bundle();
        if (pg3.D(l.longValue())) {
            bundle222.putLong("userId", l.longValue());
        } else {
            bundle222.putLong("chatId", -l.longValue());
        }
        bundle222.putInt("currentAccount", j5Var.a);
        Intent intent222 = new Intent();
        intent222.putExtras(bundle222);
        remoteViews3.setOnClickFillInIntent(R.id.shortcut_widget_item, intent222);
        remoteViews3.setViewVisibility(R.id.shortcut_widget_item_divider, i == getCount() ? 8 : i3);
        return remoteViews3;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a.v();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        vh6 vh6Var = this.h;
        vh6Var.b();
        j5 j5Var = this.d;
        if (j5Var != null) {
            int i = j5Var.a;
            if (z8c.h(i).o()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vh6 vh6Var2 = new vh6();
                cf7 Y = cf7.Y(i);
                int i2 = this.c;
                vh6 vh6Var3 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Y.a.c(new le7(Y, i2, arrayList, 0, vh6Var3, vh6Var2, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    Y.n(e, true);
                }
                oc7.r1(i).d4(arrayList2, true);
                oc7.r1(i).X3(arrayList3, true);
                vh6Var.b();
                int m = vh6Var2.m();
                for (int i3 = 0; i3 < m; i3++) {
                    vh6Var.k(new k47(j5Var.a, (TLRPC.Message) vh6Var2.n(i3), (vh6) null, (vh6) null, false, true), vh6Var2.j(i3));
                }
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
