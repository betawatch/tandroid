package ii;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        j61 j61Var;
        int i10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        String str;
        int i11 = this.a;
        int i12 = 1;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((e2) obj2).P.U1((TL_iv.RichMessage) obj);
                break;
            case 1:
                x3 x3Var = (x3) obj2;
                String str2 = (String) obj;
                x3Var.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    x3Var.R1(pageblockmath);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.hideKeyboard((cu) obj2);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 3:
                org.telegram.ui.web.y0 y0Var = ((BotWebViewContainer$WebViewProxy) obj2).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                y0Var.d(sb2.toString());
                break;
            case 4:
                org.telegram.ui.web.g1 g1Var = (org.telegram.ui.web.g1) obj2;
                g1Var.e = (ArrayList) obj;
                l61 l61Var = g1Var.a;
                if (l61Var.G) {
                    l61Var.Y2.N(true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj2;
                z1Var.n = ((ArrayList) obj).size();
                l61 l61Var2 = z1Var.a;
                if (l61Var2 != null && (j61Var = l61Var2.Y2) != null && l61Var2.G) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 6:
                pg.e0 e0Var = (pg.e0) obj2;
                pg.i1 i1Var = (pg.i1) obj;
                pg.f1 f1Var = e0Var.a;
                if (i1Var != null) {
                    float currentWeight = f1Var.getCurrentWeight();
                    i1Var.f = currentWeight;
                    double d = e0Var.p;
                    if (d > 0.0d) {
                        i1Var.f = (float) ((d / e0Var.q) * currentWeight);
                    }
                    if (i1Var.a.o() == 4) {
                        i1Var.k *= i1Var.f;
                    }
                }
                pg.s0 painting = f1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new pg.o0(painting, i1Var, i12));
                    break;
                }
                break;
            case 7:
                ph.i iVar = (ph.i) obj2;
                if (((ph.b) obj) == ph.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 8:
                ci.b6 b6Var = (ci.b6) obj2;
                TextureView textureView = (TextureView) obj;
                b6Var.w0 = textureView;
                if (textureView != null) {
                    b6Var.q0.addView(textureView, 0);
                    break;
                }
                break;
            case 9:
                qg.t2 t2Var = (qg.t2) obj2;
                t2Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.s = paint;
                Bitmap bitmap = t2Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.07f);
                t2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                break;
            case 10:
                qh.c cVar = (qh.c) obj2;
                qh.e eVar = (qh.e) obj;
                cVar.h = eVar;
                cVar.c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.q0(cVar, 19), 200L);
                break;
            case 11:
                ((rg.j0) obj2).E1((HashMap) obj);
                break;
            case 12:
                rg.w1 w1Var = (rg.w1) obj2;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (w1Var.d != isEnabled) {
                    w1Var.d = isEnabled;
                    w1Var.invalidate();
                    break;
                }
                break;
            case 13:
                MessageObject messageObject = (MessageObject) obj2;
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
                long j3 = messageObject.messageOwner.date * 1000;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = tg.i.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
                    yb ybVar = new yb(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        ybVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            ybVar.c(R.raw.forward, 30, 30, new String[0]);
                            ybVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            ybVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            ybVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    ybVar.b.setSingleLine(false);
                    ybVar.b.setMaxLines(2);
                    oc ocVar = new oc(R.getParentActivity(), R.getResourceProvider(), true);
                    ocVar.e(LocaleController.getString(R.string.LearnMore));
                    ocVar.a = new ci.u1(payments_giveawayinfo, z10, b10, j3, tL_messageMediaGiveaway2, R);
                    ybVar.setButton(ocVar);
                    qc.g(R, ybVar, 2750).j();
                    break;
                }
                break;
            case 14:
                tg.s0 s0Var = (tg.s0) obj2;
                s0Var.a0.setLoading(false);
                tg.i.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 15:
                th.f.P((th.f) obj2, (Pair) obj);
                break;
            case 16:
                HashMap hashMap = ((ug.b) obj2).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 17:
                ((ug.e) obj2).F((TLObject) obj);
                break;
            case 18:
                HashMap hashMap2 = ((ug.h) obj2).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 19:
                uh.h hVar = (uh.h) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = hVar.K;
                if (!hVar.T) {
                    hVar.I = bitmap2;
                    Bitmap bitmap3 = hVar.I;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    hVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    Paint paint2 = new Paint(2);
                    hVar.L = paint2;
                    paint2.setShader(hVar.J);
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? 0.02f : -0.15f);
                    hVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    hVar.J.setLocalMatrix(matrix);
                    break;
                } else {
                    hVar.I.recycle();
                    break;
                }
            case 20:
                ((xh.o1) obj2).a();
                break;
            case 21:
                ((xh.i4) obj2).e0(((Boolean) obj).booleanValue());
                break;
            case 22:
                ((Boolean) obj).getClass();
                xh.z3 z3Var = ((xh.g4) obj2).d;
                if (z3Var != null) {
                    z3Var.run();
                    break;
                }
                break;
            case 23:
                tg.i.j(((xh.z4) obj2).getContext(), (TLRPC.TL_error) obj);
                break;
            case 24:
                yh.a0 a0Var = (yh.a0) obj2;
                int i13 = yh.a0.w0[((Integer) obj).intValue()];
                if (a0Var.n0 != i13) {
                    a0Var.n0 = i13;
                    a0Var.f0.setText(LocaleController.formatPluralString("GiftOfferHours", i13 / 3600, new Object[0]));
                }
                a0Var.T(true);
                break;
            case 25:
                yh.s0 s0Var2 = (yh.s0) obj2;
                s0Var2.i0.g();
                s0Var2.k0.N(true);
                break;
            case 26:
                yh.i2 i2Var = (yh.i2) obj2;
                i2Var.getClass();
                i2Var.s = new Matrix();
                i2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                i2Var.r = bitmapShader2;
                Paint paint3 = i2Var.c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 27:
                yh.s5.a((yh.s5) obj2, (TL_stars.StarGifts) obj);
                break;
            case 28:
                ((org.telegram.ui.ActionBar.e3) obj2).dismiss(((Boolean) obj).booleanValue());
                break;
            default:
                TextView textView = (TextView) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i14 = starGift.availability_remains;
                        textView.setText(i14 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i14, LocaleController.formatNumber(starGift.availability_total, ',')));
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
        }
    }
}
