package dg;

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
import eg.w3;
import fg.p2;
import j$.util.Objects;
import java.util.HashMap;
import lh.e6;
import lh.f5;
import lh.p5;
import lh.r5;
import mh.q3;
import mh.t7;
import oh.f4;
import oh.i9;
import oh.l6;
import oh.t6;
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
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import qh.o4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i10) {
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
                m0 m0Var = (m0) this.b;
                r1 r1Var = (r1) obj;
                o1 o1Var = m0Var.a;
                if (r1Var != null) {
                    float currentWeight = o1Var.getCurrentWeight();
                    r1Var.f = currentWeight;
                    double d = m0Var.p;
                    if (d > 0.0d) {
                        r1Var.f = (float) ((d / m0Var.q) * currentWeight);
                    }
                    if (r1Var.a.o() == 4) {
                        r1Var.k *= r1Var.f;
                    }
                }
                c1 painting = o1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new x0(painting, r1Var, i11));
                    break;
                }
                break;
            case 1:
                dh.i iVar = (dh.i) this.b;
                if (((dh.b) obj) == dh.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 2:
                o4 o4Var = (o4) this.b;
                TextureView textureView = (TextureView) obj;
                o4Var.t0 = textureView;
                if (textureView != null) {
                    o4Var.n0.addView(textureView, 0);
                    break;
                }
                break;
            case 3:
                w3 w3Var = (w3) this.b;
                w3Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                w3Var.s = paint;
                Bitmap bitmap = w3Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                w3Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, k6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, k6.I.q() ? -0.02f : -0.07f);
                w3Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w3Var.v = new Matrix();
                break;
            case 4:
                eh.f fVar = (eh.f) this.b;
                eh.h hVar = (eh.h) obj;
                fVar.h = hVar;
                fVar.c.a(hVar, true);
                AndroidUtilities.runOnUIThread(new ag.e(fVar, 28), 200L);
                break;
            case 5:
                ((fg.v0) this.b).E1((HashMap) obj);
                break;
            case 6:
                p2 p2Var = (p2) this.b;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (p2Var.d != isEnabled) {
                    p2Var.d = isEnabled;
                    p2Var.invalidate();
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
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = hg.r.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z4 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
                    qb qbVar = new qb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        qbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        qbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            qbVar.c(R.raw.forward, 30, 30, new String[0]);
                            qbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            qbVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            qbVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    qbVar.b.setSingleLine(false);
                    qbVar.b.setMaxLines(2);
                    gc gcVar = new gc(R.getParentActivity(), R.getResourceProvider(), true);
                    gcVar.e(LocaleController.getString(R.string.LearnMore));
                    gcVar.a = new hg.j(payments_giveawayinfo, z4, b10, j10, tL_messageMediaGiveaway2, R);
                    qbVar.setButton(gcVar);
                    ic.g(R, qbVar, 2750).j();
                    break;
                }
                break;
            case 8:
                hg.w1 w1Var = (hg.w1) this.b;
                w1Var.X.setLoading(false);
                hg.r.j(w1Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 9:
                hh.f.P((hh.f) this.b, (Pair) obj);
                break;
            case 10:
                HashMap hashMap = ((ig.b) this.b).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 11:
                ((ig.e) this.b).F((TLObject) obj);
                break;
            case 12:
                HashMap hashMap2 = ((ig.h) this.b).n;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 13:
                ih.j jVar = (ih.j) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = jVar.H;
                if (!jVar.Q) {
                    jVar.F = bitmap2;
                    Bitmap bitmap3 = jVar.F;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    jVar.G = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    Paint paint2 = new Paint(2);
                    jVar.I = paint2;
                    paint2.setShader(jVar.G);
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, k6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, k6.I.q() ? 0.02f : -0.15f);
                    jVar.I.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    jVar.G.setLocalMatrix(matrix);
                    break;
                } else {
                    jVar.F.recycle();
                    break;
                }
            case 14:
                ((lh.c2) this.b).a();
                break;
            case 15:
                ((r5) this.b).e0(((Boolean) obj).booleanValue());
                break;
            case 16:
                p5 p5Var = (p5) this.b;
                ((Boolean) obj).getClass();
                f5 f5Var = p5Var.d;
                if (f5Var != null) {
                    f5Var.run();
                    break;
                }
                break;
            case 17:
                hg.r.j(((e6) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 18:
                mh.m0 m0Var2 = (mh.m0) this.b;
                int i12 = mh.m0.t0[((Integer) obj).intValue()];
                if (m0Var2.k0 != i12) {
                    m0Var2.k0 = i12;
                    m0Var2.c0.setText(LocaleController.formatPluralString("GiftOfferHours", i12 / 3600, new Object[0]));
                }
                m0Var2.T(true);
                break;
            case 19:
                mh.i1 i1Var = (mh.i1) this.b;
                i1Var.f0.g();
                i1Var.h0.N(true);
                break;
            case 20:
                q3 q3Var = (q3) this.b;
                q3Var.getClass();
                q3Var.s = new Matrix();
                q3Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                q3Var.r = bitmapShader2;
                Paint paint3 = q3Var.c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 21:
                t7.a((t7) this.b, (TL_stars.StarGifts) obj);
                break;
            case 22:
                ((h3) this.b).dismiss(((Boolean) obj).booleanValue());
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
                oh.e1 e1Var = (oh.e1) this.b;
                if (((Boolean) obj).booleanValue() && !e1Var.w) {
                    e1Var.n = true;
                    e1Var.F = true;
                    e1Var.u(false);
                    oh.e1.T = e1Var;
                    e1Var.G = NativeInstance.createVideoCapturer(e1Var.E, e1Var.F ? 1 : 0);
                    if (e1Var.B != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = e1Var.B;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance, 4));
                        e1Var.J.clear();
                        e1Var.B = null;
                    }
                    e1Var.c();
                    e1Var.k();
                    NotificationCenter.getInstance(e1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var.f.id));
                    break;
                }
                break;
            case 25:
                f4 f4Var = (f4) this.b;
                f4Var.I3 = ((Long) obj).longValue();
                oh.p2 p2Var2 = f4Var.Y1;
                if (p2Var2 != null) {
                    p2Var2.J(true);
                    f4Var.Y1.R1();
                }
                f4Var.r0(true);
                break;
            case 26:
                i9 i9Var = (i9) this.b;
                i9Var.h1 = false;
                i9Var.P();
                break;
            case 27:
                t6 t6Var = (t6) this.b;
                l6 l6Var = (l6) obj;
                HashMap hashMap3 = t6Var.H;
                int i14 = l6Var.e;
                int i15 = l6Var.f;
                long j11 = l6Var.d;
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
                    HashMap hashMap5 = t6Var.G[i14];
                    if (hashMap5 != null) {
                        hashMap5.remove(Long.valueOf(j11));
                        break;
                    }
                }
                break;
            case 28:
                AndroidUtilities.hideKeyboard((xt) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            default:
                org.telegram.ui.web.x0 x0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb = new StringBuilder("window.navigator.__share__receive(");
                sb.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb.append(")");
                x0Var.d(sb.toString());
                break;
        }
    }
}
