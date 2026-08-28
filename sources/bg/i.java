package bg;

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
import fh.e6;
import fh.g6;
import fh.t5;
import fh.u6;
import gh.s3;
import gh.v7;
import ih.i4;
import ih.j7;
import ih.m9;
import ih.n6;
import ih.v6;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import kh.a8;
import kh.k8;
import kh.q3;
import kh.r6;
import kh.wb;
import kh.ya;
import kh.z7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        if (android.text.TextUtils.isEmpty(r4.G1.y) == false) goto L34;
     */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        String str;
        int i9 = 2;
        int i10 = 0;
        switch (this.a) {
            case 0:
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
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = u.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
                    ob obVar = new ob(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        obVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        obVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            obVar.c(R.raw.forward, 30, 30, new String[0]);
                            obVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            obVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            obVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    obVar.b.setSingleLine(false);
                    obVar.b.setMaxLines(2);
                    ec ecVar = new ec(R.getParentActivity(), R.getResourceProvider(), true);
                    ecVar.e(LocaleController.getString(R.string.LearnMore));
                    ecVar.a = new m(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, R);
                    obVar.setButton(ecVar);
                    gc.g(R, obVar, 2750).j();
                    break;
                }
                break;
            case 1:
                g2 g2Var = (g2) this.b;
                g2Var.W.setLoading(false);
                u.j(g2Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 2:
                bh.j.O((bh.j) this.b, (Pair) obj);
                break;
            case 3:
                HashMap hashMap = ((cg.b) this.b).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 4:
                ((cg.e) this.b).F((TLObject) obj);
                break;
            case 5:
                HashMap hashMap2 = ((cg.h) this.b).n;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 6:
                ch.j jVar = (ch.j) this.b;
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
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f6.I.q() ? 0.02f : -0.15f);
                    jVar.H.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    jVar.F.setLocalMatrix(matrix);
                    break;
                } else {
                    jVar.E.recycle();
                    break;
                }
            case 7:
                ((fh.k2) this.b).a();
                break;
            case 8:
                ((g6) this.b).d0(((Boolean) obj).booleanValue());
                break;
            case 9:
                e6 e6Var = (e6) this.b;
                ((Boolean) obj).getClass();
                t5 t5Var = e6Var.d;
                if (t5Var != null) {
                    t5Var.run();
                    break;
                }
                break;
            case 10:
                u.j(((u6) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 11:
                gh.o0 o0Var = (gh.o0) this.b;
                int i11 = gh.o0.s0[((Integer) obj).intValue()];
                if (o0Var.j0 != i11) {
                    o0Var.j0 = i11;
                    o0Var.b0.setText(LocaleController.formatPluralString("GiftOfferHours", i11 / 3600, new Object[0]));
                }
                o0Var.S(true);
                break;
            case 12:
                gh.l1 l1Var = (gh.l1) this.b;
                l1Var.e0.g();
                l1Var.g0.N(true);
                break;
            case 13:
                s3 s3Var = (s3) this.b;
                s3Var.getClass();
                s3Var.s = new Matrix();
                s3Var.v = new Matrix();
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode2, tileMode2);
                s3Var.r = bitmapShader;
                Paint paint2 = s3Var.c;
                paint2.setShader(bitmapShader);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, 0.25f);
                paint2.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                break;
            case 14:
                v7.a((v7) this.b, (TL_stars.StarGifts) obj);
                break;
            case 15:
                ((org.telegram.ui.ActionBar.f3) this.b).dismiss(((Boolean) obj).booleanValue());
                break;
            case 16:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i12 = starGift.availability_remains;
                        textView.setText(i12 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i12, LocaleController.formatNumber(starGift.availability_total, ',')));
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
            case 17:
                ih.f1 f1Var = (ih.f1) this.b;
                if (((Boolean) obj).booleanValue() && !f1Var.w) {
                    f1Var.n = true;
                    f1Var.E = true;
                    f1Var.u(false);
                    ih.f1.S = f1Var;
                    f1Var.F = NativeInstance.createVideoCapturer(f1Var.D, f1Var.E ? 1 : 0);
                    if (f1Var.A != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = f1Var.A;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                        f1Var.I.clear();
                        f1Var.A = null;
                    }
                    f1Var.c();
                    f1Var.k();
                    NotificationCenter.getInstance(f1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var.f.id));
                    break;
                }
                break;
            case 18:
                i4 i4Var = (i4) this.b;
                i4Var.H3 = ((Long) obj).longValue();
                ih.p2 p2Var = i4Var.X1;
                if (p2Var != null) {
                    p2Var.J(true);
                    i4Var.X1.R1();
                }
                i4Var.r0(true);
                break;
            case 19:
                m9 m9Var = (m9) this.b;
                m9Var.g1 = false;
                m9Var.P();
                break;
            case 20:
                v6 v6Var = (v6) this.b;
                n6 n6Var = (n6) obj;
                HashMap hashMap3 = v6Var.H;
                int i13 = n6Var.e;
                int i14 = n6Var.f;
                long j11 = n6Var.d;
                if (i13 == 0 && i14 > 0) {
                    HashMap hashMap4 = (HashMap) hashMap3.get(Long.valueOf(j11));
                    if (hashMap4 != null) {
                        hashMap4.remove(Integer.valueOf(i14));
                        if (hashMap4.isEmpty()) {
                            hashMap3.remove(Long.valueOf(j11));
                            break;
                        }
                    }
                } else {
                    HashMap hashMap5 = v6Var.G[i13];
                    if (hashMap5 != null) {
                        hashMap5.remove(Long.valueOf(j11));
                        break;
                    }
                }
                break;
            case 21:
                jh.u uVar = (jh.u) this.b;
                String str2 = (String) obj;
                ArrayList arrayList = uVar.h;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                    uVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new j7(9, uVar, str2), 120L);
                break;
            case 22:
                ((kh.m) this.b).x(((Integer) obj).intValue());
                break;
            case 23:
                kh.f0 f0Var = (kh.f0) this.b;
                f0Var.f0.n.P = ((Float) obj).floatValue();
                kh.e0 e0Var = f0Var.f0;
                kh.d0 d0Var = e0Var.d;
                if (d0Var != null) {
                    d0Var.setVolume(e0Var.n.P);
                    break;
                }
                break;
            case 24:
                kh.s0 s0Var = (kh.s0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject2 = s0Var.c;
                if (messageObject2 != null) {
                    messageObject2.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(s0Var.c);
                    break;
                }
                break;
            case 25:
                kh.s2 s2Var = (kh.s2) this.b;
                s2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new j7(14, s2Var, (Runnable) obj), 80L);
                break;
            case 26:
                ((q3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.q1.w).start();
                break;
            case 27:
                ya yaVar = (ya) ((kh.g6) this.b);
                wb wbVar = yaVar.w2;
                wbVar.T0.q((MessageObject) obj);
                a8 a8Var = wbVar.G1;
                if (a8Var != null && wbVar.K1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(a8Var.y);
                    boolean z11 = !isEmpty;
                    ((qf0) wbVar.f1.c).a(!wbVar.T0.k(), false);
                    wbVar.f1.setVisibility(0);
                    wbVar.f1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new eh.f(11, yaVar, z11)).start();
                }
                if (wbVar.w0.j()) {
                    ArrayList arrayList2 = wbVar.w0.h;
                    int size = arrayList2.size();
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            a8 a8Var2 = ((kh.e0) obj2).n;
                            if (a8Var2 != null && a8Var2.K) {
                                break;
                            }
                        }
                    }
                }
                i9 = -1;
                wbVar.l0(i9, true, true);
                break;
            case 28:
                z7 z7Var = (z7) obj;
                y51 y51Var = ((r6) this.b).n;
                if (y51Var != null) {
                    y51Var.setHDRInfo(z7Var);
                    break;
                }
                break;
            default:
                k8 k8Var = (k8) this.b;
                yf.m0 m0Var = (yf.m0) obj;
                if (m0Var != null) {
                    k8Var.k0 = m0Var.e;
                    k8Var.j0 = m0Var.f;
                    break;
                } else {
                    k8Var.T();
                    break;
                }
        }
    }
}
