package ji;

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
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.z61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        z61 z61Var;
        int i10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        String str;
        int i11 = this.a;
        int i12 = 1;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ((d2) obj2).P.V1((TL_iv.RichMessage) obj);
                break;
            case 1:
                x3 x3Var = (x3) obj2;
                String str2 = (String) obj;
                x3Var.getClass();
                if (!TextUtils.isEmpty(str2)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str2;
                    x3Var.S1(pageblockmath);
                    break;
                }
                break;
            case 2:
                AndroidUtilities.hideKeyboard((nu) obj2);
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
                b71 b71Var = g1Var.a;
                if (b71Var.G) {
                    b71Var.W2.N(true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj2;
                y1Var.n = ((ArrayList) obj).size();
                b71 b71Var2 = y1Var.a;
                if (b71Var2 != null && (z61Var = b71Var2.W2) != null && b71Var2.G) {
                    z61Var.N(true);
                    break;
                }
                break;
            case 6:
                qg.d0 d0Var = (qg.d0) obj2;
                qg.f1 f1Var = (qg.f1) obj;
                qg.c1 c1Var = d0Var.a;
                if (f1Var != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var.f = currentWeight;
                    double d = d0Var.p;
                    if (d > 0.0d) {
                        f1Var.f = (float) ((d / d0Var.q) * currentWeight);
                    }
                    if (f1Var.a.o() == 4) {
                        f1Var.k *= f1Var.f;
                    }
                }
                qg.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new qg.m0(painting, f1Var, i12));
                    break;
                }
                break;
            case 7:
                qh.i iVar = (qh.i) obj2;
                if (((qh.b) obj) == qh.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 8:
                di.a6 a6Var = (di.a6) obj2;
                TextureView textureView = (TextureView) obj;
                a6Var.w0 = textureView;
                if (textureView != null) {
                    a6Var.q0.addView(textureView, 0);
                    break;
                }
                break;
            case 9:
                rg.v2 v2Var = (rg.v2) obj2;
                v2Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                v2Var.s = paint;
                Bitmap bitmap = v2Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                v2Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.07f);
                v2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                v2Var.v = new Matrix();
                break;
            case 10:
                rh.c cVar = (rh.c) obj2;
                rh.e eVar = (rh.e) obj;
                cVar.h = eVar;
                cVar.c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.m2(cVar, 27), 200L);
                break;
            case 11:
                ((sg.j0) obj2).F1((HashMap) obj);
                break;
            case 12:
                sg.x1 x1Var = (sg.x1) obj2;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (x1Var.d != isEnabled) {
                    x1Var.d = isEnabled;
                    x1Var.invalidate();
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
                long j10 = messageObject.messageOwner.date * 1000;
                org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = ug.j.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z10 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
                    ac acVar = new ac(R.getParentActivity(), R.getResourceProvider());
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        acVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                        acVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusEnded));
                    } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                        if (((TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo).participating) {
                            acVar.c(R.raw.forward, 30, 30, new String[0]);
                            acVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusParticipating));
                        } else {
                            acVar.c(R.raw.chats_infotip, 30, 30, new String[0]);
                            acVar.b.setText(LocaleController.getString(R.string.BoostingGiveawayShortStatusNotParticipating));
                        }
                    }
                    acVar.b.setSingleLine(false);
                    acVar.b.setMaxLines(2);
                    qc qcVar = new qc(R.getParentActivity(), R.getResourceProvider(), true);
                    qcVar.e(LocaleController.getString(R.string.LearnMore));
                    qcVar.a = new di.t1(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, R);
                    acVar.setButton(qcVar);
                    sc.g(R, acVar, 2750).j();
                    break;
                }
                break;
            case 14:
                ug.s0 s0Var = (ug.s0) obj2;
                s0Var.a0.setLoading(false);
                ug.j.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 15:
                uh.f.Q((uh.f) obj2, (Pair) obj);
                break;
            case 16:
                HashMap hashMap = ((vg.b) obj2).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 17:
                ((vg.e) obj2).F((TLObject) obj);
                break;
            case 18:
                HashMap hashMap2 = ((vg.h) obj2).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 19:
                vh.h hVar = (vh.h) obj2;
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
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? 0.02f : -0.15f);
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
                ((yh.m1) obj2).a();
                break;
            case 21:
                ((yh.g4) obj2).e0(((Boolean) obj).booleanValue());
                break;
            case 22:
                ((Boolean) obj).getClass();
                yh.x3 x3Var2 = ((yh.e4) obj2).d;
                if (x3Var2 != null) {
                    x3Var2.run();
                    break;
                }
                break;
            case 23:
                ug.j.j(((yh.x4) obj2).getContext(), (TLRPC.TL_error) obj);
                break;
            case 24:
                zh.z zVar = (zh.z) obj2;
                int i13 = zh.z.w0[((Integer) obj).intValue()];
                if (zVar.n0 != i13) {
                    zVar.n0 = i13;
                    zVar.f0.setText(LocaleController.formatPluralString("GiftOfferHours", i13 / 3600, new Object[0]));
                }
                zVar.U(true);
                break;
            case 25:
                zh.r0 r0Var = (zh.r0) obj2;
                r0Var.i0.g();
                r0Var.k0.N(true);
                break;
            case 26:
                zh.e2 e2Var = (zh.e2) obj2;
                e2Var.getClass();
                e2Var.s = new Matrix();
                e2Var.v = new Matrix();
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader((Bitmap) obj, tileMode3, tileMode3);
                e2Var.r = bitmapShader2;
                Paint paint3 = e2Var.c;
                paint3.setShader(bitmapShader2);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, 0.25f);
                paint3.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 27:
                zh.n5.a((zh.n5) obj2, (TL_stars.StarGifts) obj);
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
