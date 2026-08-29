package ag;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Pair;
import android.view.TextureView;
import android.widget.TextView;
import bg.c4;
import cg.s2;
import ih.e6;
import ih.p5;
import ih.r5;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import jh.r3;
import jh.s7;
import lh.d4;
import lh.i9;
import lh.k6;
import lh.s6;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.ub;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        String str;
        int i11 = 1;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                w1 w1Var = (w1) obj;
                t1 t1Var = n0Var.a;
                if (w1Var != null) {
                    float currentWeight = t1Var.getCurrentWeight();
                    w1Var.f = currentWeight;
                    double d = n0Var.p;
                    if (d > 0.0d) {
                        w1Var.f = (float) ((d / n0Var.q) * currentWeight);
                    }
                    if (w1Var.a.o() == 4) {
                        w1Var.k *= w1Var.f;
                    }
                }
                f1 painting = t1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new a1(painting, w1Var, i11));
                    break;
                }
                break;
            case 1:
                ah.i iVar = (ah.i) this.b;
                if (((ah.b) obj) == ah.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 2:
                f5 f5Var = (f5) this.b;
                TextureView textureView = (TextureView) obj;
                f5Var.s0 = textureView;
                if (textureView != null) {
                    f5Var.m0.addView(textureView, 0);
                    break;
                }
                break;
            case 3:
                c4 c4Var = (c4) this.b;
                c4Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                c4Var.s = paint;
                Bitmap bitmap = c4Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                c4Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, g6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, g6.I.q() ? -0.02f : -0.07f);
                c4Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                c4Var.v = new Matrix();
                break;
            case 4:
                bh.f fVar = (bh.f) this.b;
                bh.h hVar = (bh.h) obj;
                fVar.h = hVar;
                fVar.c.a(hVar, true);
                AndroidUtilities.runOnUIThread(new a4.g(fVar, 17), 200L);
                break;
            case 5:
                ((cg.v0) this.b).E1((HashMap) obj);
                break;
            case 6:
                s2 s2Var = (s2) this.b;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (s2Var.d != isEnabled) {
                    s2Var.d = isEnabled;
                    s2Var.invalidate();
                    break;
                }
                break;
            case 7:
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
                long j10 = messageObject.messageOwner.date * 1000;
                o2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = eg.s.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
                    ub ubVar = new ub(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ubVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ubVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ubVar.c(R.raw.forward, 30, 30, new String[0]);
                            ubVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            ubVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ubVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    ubVar.b.setSingleLine(false);
                    ubVar.b.setMaxLines(2);
                    kc kcVar = new kc(R.getParentActivity(), R.getResourceProvider(), true);
                    kcVar.e(LocaleController.getString(R.string.LearnMore));
                    kcVar.a = new eg.j(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, R);
                    ubVar.setButton(kcVar);
                    mc.g(R, ubVar, 2750).j();
                    break;
                }
                break;
            case 8:
                eg.x1 x1Var = (eg.x1) this.b;
                x1Var.W.setLoading(false);
                eg.s.j(x1Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 9:
                eh.f.P((eh.f) this.b, (Pair) obj);
                break;
            case 10:
                HashMap hashMap = ((fg.b) this.b).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 11:
                ((fg.e) this.b).F((TLObject) obj);
                break;
            case 12:
                HashMap hashMap2 = ((fg.h) this.b).n;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 13:
                fh.j jVar = (fh.j) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = jVar.G;
                if (!jVar.P) {
                    jVar.E = bitmap2;
                    Bitmap bitmap3 = jVar.E;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    jVar.F = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    Paint paint2 = new Paint(2);
                    jVar.H = paint2;
                    paint2.setShader(jVar.F);
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, g6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, g6.I.q() ? 0.02f : -0.15f);
                    jVar.H.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    jVar.F.setLocalMatrix(matrix);
                    break;
                } else {
                    jVar.E.recycle();
                    break;
                }
            case 14:
                ((ih.d2) this.b).a();
                break;
            case 15:
                ((r5) this.b).e0(((Boolean) obj).booleanValue());
                break;
            case 16:
                p5 p5Var = (p5) this.b;
                ((Boolean) obj).getClass();
                ih.f5 f5Var2 = p5Var.d;
                if (f5Var2 != null) {
                    f5Var2.run();
                    break;
                }
                break;
            case 17:
                eg.s.j(((e6) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 18:
                jh.n0 n0Var2 = (jh.n0) this.b;
                int i12 = jh.n0.s0[((Integer) obj).intValue()];
                if (n0Var2.j0 != i12) {
                    n0Var2.j0 = i12;
                    n0Var2.b0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                n0Var2.T(true);
                break;
            case 19:
                jh.j1 j1Var = (jh.j1) this.b;
                j1Var.e0.g();
                j1Var.g0.N(true);
                break;
            case 20:
                r3 r3Var = (r3) this.b;
                r3Var.getClass();
                r3Var.s = new Matrix();
                r3Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                r3Var.r = bitmapShader2;
                Paint paint3 = r3Var.c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 21:
                s7.a((s7) this.b, (TL_stars.StarGifts) obj);
                break;
            case 22:
                ((f3) this.b).dismiss(((Boolean) obj).booleanValue());
                break;
            case 23:
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
            case 24:
                lh.d1 d1Var = (lh.d1) this.b;
                if (((Boolean) obj).booleanValue() && !d1Var.w) {
                    d1Var.n = true;
                    d1Var.E = true;
                    d1Var.u(false);
                    lh.d1.S = d1Var;
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
            case 25:
                d4 d4Var = (d4) this.b;
                d4Var.H3 = ((Long) obj).longValue();
                lh.n2 n2Var = d4Var.X1;
                if (n2Var != null) {
                    n2Var.J(true);
                    d4Var.X1.R1();
                }
                d4Var.r0(true);
                break;
            case 26:
                i9 i9Var = (i9) this.b;
                i9Var.g1 = false;
                i9Var.P();
                break;
            case 27:
                s6 s6Var = (s6) this.b;
                k6 k6Var = (k6) obj;
                HashMap hashMap3 = s6Var.H;
                int i14 = k6Var.e;
                int i15 = k6Var.f;
                long j11 = k6Var.d;
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
            case 28:
                mh.v vVar = (mh.v) this.b;
                String str2 = (String) obj;
                ArrayList arrayList = vVar.h;
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new lh.r3(23, vVar, str2), 120L);
                break;
            default:
                ((nh.m) this.b).x(((Integer) obj).intValue());
                break;
        }
    }
}
