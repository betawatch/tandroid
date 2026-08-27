package ag;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import gh.m5;
import gh.m6;
import gh.w5;
import gh.y5;
import hh.r3;
import hh.u7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import jh.e4;
import jh.i9;
import jh.j6;
import jh.p6;
import jh.s6;
import lh.f6;
import lh.sb;
import lh.va;
import lh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.G1.y) == false) goto L25;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        String str;
        int i10 = 2;
        int i11 = 0;
        switch (this.a) {
            case 0:
                ((i1) this.b).E1((HashMap) obj);
                break;
            case 1:
                k3 k3Var = (k3) this.b;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (k3Var.d != isEnabled) {
                    k3Var.d = isEnabled;
                    k3Var.invalidate();
                    break;
                }
                break;
            case 2:
                MessageObject messageObject = (MessageObject) this.b;
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                if (messageMedia instanceof TLRPC.TL_messageMediaGiveawayResults) {
                    TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) messageMedia;
                    tL_messageMediaGiveaway = new TLRPC.TL_messageMediaGiveaway();
                    tL_messageMediaGiveaway.prize_description = tL_messageMediaGiveawayResults.prize_description;
                    tL_messageMediaGiveaway.months = tL_messageMediaGiveawayResults.months;
                    tL_messageMediaGiveaway.quantity = tL_messageMediaGiveawayResults.winners_count + tL_messageMediaGiveawayResults.unclaimed_count;
                    tL_messageMediaGiveaway.only_new_subscribers = tL_messageMediaGiveawayResults.only_new_subscribers;
                    tL_messageMediaGiveaway.until_date = tL_messageMediaGiveawayResults.until_date;
                    if ((tL_messageMediaGiveawayResults.flags & 32) != 0) {
                        tL_messageMediaGiveaway.flags |= 32;
                        tL_messageMediaGiveaway.stars = tL_messageMediaGiveawayResults.stars;
                    }
                } else {
                    tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) messageMedia;
                }
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = tL_messageMediaGiveaway;
                long j10 = 1000 * messageObject.messageOwner.date;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = cg.r.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
                    mb mbVar = new mb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        mbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        mbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            mbVar.c(R.raw.forward, 30, 30, new String[0]);
                            mbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            mbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            mbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    mbVar.b.setSingleLine(false);
                    mbVar.b.setMaxLines(2);
                    cc ccVar = new cc(R.getParentActivity(), R.getResourceProvider(), true);
                    ccVar.e(LocaleController.getString(R.string.LearnMore));
                    ccVar.a = new cg.j(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, R);
                    mbVar.setButton(ccVar);
                    ec.g(R, mbVar, 2750).j();
                    break;
                }
                break;
            case 3:
                cg.z1 z1Var = (cg.z1) this.b;
                z1Var.W.setLoading(false);
                cg.r.j(z1Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 4:
                ch.h.P((ch.h) this.b, (Pair) obj);
                break;
            case 5:
                HashMap hashMap = ((dg.b) this.b).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 6:
                ((dg.e) this.b).F((TLObject) obj);
                break;
            case 7:
                HashMap hashMap2 = ((dg.h) this.b).n;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 8:
                dh.j jVar = (dh.j) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Matrix matrix = jVar.G;
                if (!jVar.P) {
                    jVar.E = bitmap;
                    Bitmap bitmap2 = jVar.E;
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    jVar.F = new BitmapShader(bitmap2, tileMode, tileMode);
                    Paint paint = new Paint(2);
                    jVar.H = paint;
                    paint.setShader(jVar.F);
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, g6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, g6.I.q() ? 0.02f : -0.15f);
                    jVar.H.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    jVar.F.setLocalMatrix(matrix);
                    break;
                } else {
                    jVar.E.recycle();
                    break;
                }
            case 9:
                ((gh.g2) this.b).a();
                break;
            case 10:
                ((y5) this.b).e0(((Boolean) obj).booleanValue());
                break;
            case 11:
                w5 w5Var = (w5) this.b;
                ((Boolean) obj).getClass();
                m5 m5Var = w5Var.d;
                if (m5Var != null) {
                    m5Var.run();
                    break;
                }
                break;
            case 12:
                cg.r.j(((m6) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 13:
                hh.o0 o0Var = (hh.o0) this.b;
                int i12 = hh.o0.s0[((Integer) obj).intValue()];
                if (o0Var.j0 != i12) {
                    o0Var.j0 = i12;
                    o0Var.b0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                o0Var.T(true);
                break;
            case 14:
                hh.l1 l1Var = (hh.l1) this.b;
                l1Var.e0.g();
                l1Var.g0.N(true);
                break;
            case 15:
                r3 r3Var = (r3) this.b;
                r3Var.getClass();
                r3Var.s = new Matrix();
                r3Var.v = new Matrix();
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode2, tileMode2);
                r3Var.r = bitmapShader;
                Paint paint2 = r3Var.c;
                paint2.setShader(bitmapShader);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.25f);
                paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                break;
            case 16:
                u7.a((u7) this.b, (TL_stars.StarGifts) obj);
                break;
            case 17:
                ((org.telegram.ui.ActionBar.e3) this.b).dismiss(((Boolean) obj).booleanValue());
                break;
            case 18:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i13 = starGift.availability_remains;
                        textView.setText(i13 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i13, LocaleController.formatNumber(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = LocaleController.formatPluralStringComma("Gift2QuantityIssued1", starGift.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
            case 19:
                jh.d1 d1Var = (jh.d1) this.b;
                if (((Boolean) obj).booleanValue() && !d1Var.w) {
                    d1Var.n = true;
                    d1Var.E = true;
                    d1Var.u(false);
                    jh.d1.S = d1Var;
                    d1Var.F = NativeInstance.createVideoCapturer(d1Var.D, d1Var.E ? 1 : 0);
                    if (d1Var.A != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = d1Var.A;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                        d1Var.I.clear();
                        d1Var.A = null;
                    }
                    d1Var.c();
                    d1Var.k();
                    NotificationCenter.getInstance(d1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var.f.id));
                    break;
                }
                break;
            case 20:
                e4 e4Var = (e4) this.b;
                e4Var.H3 = ((Long) obj).longValue();
                jh.o2 o2Var = e4Var.X1;
                if (o2Var != null) {
                    o2Var.K(true);
                    e4Var.X1.Q1();
                }
                e4Var.r0(true);
                break;
            case 21:
                i9 i9Var = (i9) this.b;
                i9Var.g1 = false;
                i9Var.P();
                break;
            case 22:
                s6 s6Var = (s6) this.b;
                j6 j6Var = (j6) obj;
                HashMap hashMap3 = s6Var.H;
                int i14 = j6Var.e;
                int i15 = j6Var.f;
                long j11 = j6Var.d;
                if (i14 == 0 && i15 > 0) {
                    HashMap hashMap4 = (HashMap) hashMap3.get(Long.valueOf(j11));
                    if (hashMap4 != null) {
                        hashMap4.remove(Integer.valueOf(i15));
                        if (hashMap4.isEmpty()) {
                            hashMap3.remove(Long.valueOf(j11));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap5 = s6Var.G[i14];
                    if (hashMap5 != null) {
                        hashMap5.remove(Long.valueOf(j11));
                        break;
                    }
                }
                break;
            case 23:
                kh.v vVar = (kh.v) this.b;
                String str2 = (String) obj;
                ArrayList arrayList = vVar.h;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new p6(15, vVar, str2), 120L);
                break;
            case 24:
                ((lh.m) this.b).x(((Integer) obj).intValue());
                break;
            case 25:
                lh.e0 e0Var = (lh.e0) this.b;
                e0Var.f0.n.P = ((Float) obj).floatValue();
                lh.d0 d0Var = e0Var.f0;
                o3 o3Var = d0Var.d;
                if (o3Var != null) {
                    o3Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 26:
                lh.r0 r0Var = (lh.r0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject2 = r0Var.c;
                if (messageObject2 != null) {
                    messageObject2.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.c);
                    break;
                }
                break;
            case 27:
                lh.r2 r2Var = (lh.r2) this.b;
                r2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new p6(20, r2Var, (Runnable) obj), 80L);
                break;
            case 28:
                ((lh.p3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.p1.w).start();
                break;
            default:
                va vaVar = (va) ((f6) this.b);
                sb sbVar = vaVar.w2;
                sbVar.T0.q((MessageObject) obj);
                z7 z7Var = sbVar.G1;
                if (z7Var != null && sbVar.K1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(z7Var.y);
                    boolean z11 = !isEmpty;
                    ((tf0) sbVar.f1.c).a(!sbVar.T0.k(), false);
                    sbVar.f1.setVisibility(0);
                    sbVar.f1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new fh.f(11, vaVar, z11)).start();
                }
                if (sbVar.w0.j()) {
                    ArrayList arrayList2 = sbVar.w0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList2.get(i11);
                            i11++;
                            z7 z7Var2 = ((lh.d0) obj2).n;
                            if (z7Var2 != null && z7Var2.K) {
                                break;
                            }
                        }
                    }
                }
                i10 = -1;
                sbVar.l0(i10, true, true);
                break;
        }
    }
}
