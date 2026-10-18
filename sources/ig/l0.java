package ig;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.TextureView;
import ei.r5;
import java.util.ArrayList;
import java.util.HashMap;
import ki.c6;
import ki.h2;
import ki.j3;
import ki.n3;
import ki.w3;
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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import rg.t2;
import yh.f4;
import yh.h4;
import yh.y3;
import yh.y4;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        s61 s61Var;
        s61 s61Var2;
        int i10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                t0Var.G = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : t0Var.G.connected_bots.get(0);
                t0Var.H = tL_connectedBot;
                t0Var.M = tL_connectedBot == null ? null : t0Var.getMessagesController().getUser(Long.valueOf(t0Var.H.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = t0Var.H;
                t0Var.J = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = t0Var.H;
                t0Var.I = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                a0 a0Var = t0Var.v;
                if (a0Var != null) {
                    a0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                a71 a71Var = t0Var.c;
                if (a71Var != null && (s61Var = a71Var.W2) != null) {
                    s61Var.N(true);
                }
                t0Var.Y(true);
                t0Var.T = true;
                break;
            case 1:
                v0 v0Var = (v0) this.b;
                v0Var.w = v0Var.e[((Integer) obj).intValue()];
                v0Var.V(true);
                break;
            case 2:
                x1 x1Var = (x1) this.b;
                x1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", x1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                sn snVar = new sn(bundle);
                snVar.C9 = true;
                x1Var.presentFragment(snVar);
                break;
            case 3:
                AndroidUtilities.hideKeyboard((q1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 4:
                n3 n3Var = (n3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i11 = n3Var.b;
                int i12 = n3Var.a;
                w3 w3Var = n3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList = w3Var.j3;
                    ArrayList arrayList2 = w3Var.j3;
                    if (i12 < arrayList.size() && i11 < arrayList2.size()) {
                        h2 h2Var = w3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                        }
                        j3 j3Var = w3Var.l3;
                        if (j3Var != null) {
                            j3Var.f(false);
                        }
                        ki.a aVar = (ki.a) arrayList2.get(i12);
                        ki.a aVar2 = (ki.a) arrayList2.get(i11);
                        String N4 = w3.B3(aVar.b) ? w3Var.N4(aVar) : "";
                        CharSequence N42 = w3.B3(aVar2.b) ? w3Var.N4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N4.subSequence(0, Math.max(0, Math.min(n3Var.c, N4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(N42.subSequence(Math.max(0, Math.min(n3Var.d, N42.length())), N42.length()));
                        ArrayList arrayList3 = new ArrayList();
                        w3.X2(arrayList3, richMessage.blocks, null);
                        if (arrayList3.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            c6.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList3.add(new ki.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                ki.a aVar3 = (ki.a) arrayList3.get(0);
                                if (w3.B3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) c6.A(aVar3.b));
                                    c6.e(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    c6.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList3.add(0, new ki.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                ki.a aVar4 = (ki.a) i2.d.h(1, arrayList3);
                                if (w3.B3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(c6.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    c6.e(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    c6.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList3.add(new ki.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = w3Var.i3;
                        if (richMessage2 == null) {
                            w3Var.i3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList4 = richMessage.photos;
                            if (arrayList4 != null) {
                                richMessage2.photos.addAll(arrayList4);
                            }
                            ArrayList<TLRPC.Document> arrayList5 = richMessage.documents;
                            if (arrayList5 != null) {
                                w3Var.i3.documents.addAll(arrayList5);
                            }
                        }
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            w3Var.w4((ki.a) arrayList3.get(i13));
                        }
                        while (i11 >= i12) {
                            arrayList2.remove(i11);
                            i11--;
                        }
                        arrayList2.addAll(i12, arrayList3);
                        w3Var.t4();
                        w3Var.W2.N(false);
                        h2 h2Var2 = w3Var.H3;
                        if (h2Var2 != null) {
                            h2Var2.h();
                        }
                        w3Var.f3.onContentChanged();
                        w3Var.post(new hi.t(24, n3Var, arrayList3.isEmpty() ? null : (ki.a) i2.d.h(1, arrayList3)));
                        break;
                    }
                }
                break;
            case 5:
                ((ki.l) this.b).a.r.V1((TL_iv.RichMessage) obj);
                break;
            case 6:
                ((ki.d2) this.b).P.V1((TL_iv.RichMessage) obj);
                break;
            case 7:
                w3 w3Var2 = (w3) this.b;
                String str = (String) obj;
                w3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    w3Var2.S1(pageblockmath);
                    break;
                }
                break;
            case 8:
                AndroidUtilities.hideKeyboard((iu) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 9:
                org.telegram.ui.web.x0 x0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                x0Var.d(sb2.toString());
                break;
            case 10:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                f1Var.e = (ArrayList) obj;
                u61 u61Var = f1Var.a;
                if (u61Var.G) {
                    u61Var.W2.N(true);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.x1 x1Var2 = (org.telegram.ui.web.x1) this.b;
                x1Var2.n = ((ArrayList) obj).size();
                u61 u61Var2 = x1Var2.a;
                if (u61Var2 != null && (s61Var2 = u61Var2.W2) != null && u61Var2.G) {
                    s61Var2.N(true);
                    break;
                }
                break;
            case 12:
                qg.e0 e0Var = (qg.e0) this.b;
                qg.h1 h1Var = (qg.h1) obj;
                qg.e1 e1Var = e0Var.a;
                if (h1Var != null) {
                    float currentWeight = e1Var.getCurrentWeight();
                    h1Var.f = currentWeight;
                    double d = e0Var.p;
                    if (d > 0.0d) {
                        h1Var.f = (float) ((d / e0Var.q) * currentWeight);
                    }
                    if (h1Var.a.o() == 4) {
                        h1Var.k *= h1Var.f;
                    }
                }
                qg.s0 painting = e1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new qg.o0(painting, h1Var, 1));
                    break;
                }
                break;
            case 13:
                qh.i iVar = (qh.i) this.b;
                if (((qh.b) obj) == qh.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 14:
                r5 r5Var = (r5) this.b;
                TextureView textureView = (TextureView) obj;
                r5Var.w0 = textureView;
                if (textureView != null) {
                    r5Var.q0.addView(textureView, 0);
                    break;
                }
                break;
            case 15:
                t2 t2Var = (t2) this.b;
                t2Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.s = paint;
                Bitmap bitmap = t2Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, h6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, h6.I.q() ? -0.02f : -0.07f);
                t2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                break;
            case 16:
                rh.c cVar = (rh.c) this.b;
                rh.e eVar = (rh.e) obj;
                cVar.h = eVar;
                cVar.c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.z1(cVar, 16), 200L);
                break;
            case 17:
                ((sg.j0) this.b).F1((HashMap) obj);
                break;
            case 18:
                sg.w1 w1Var = (sg.w1) this.b;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (w1Var.d != isEnabled) {
                    w1Var.d = isEnabled;
                    w1Var.invalidate();
                    break;
                }
                break;
            case 19:
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
                n2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = ug.i.b(messageObject);
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
                    ocVar.a = new ei.s1(payments_giveawayinfo, z10, b10, j10, tL_messageMediaGiveaway2, R);
                    ybVar.setButton(ocVar);
                    qc.g(R, ybVar, 2750).j();
                    break;
                }
                break;
            case 20:
                ug.r0 r0Var = (ug.r0) this.b;
                r0Var.a0.setLoading(false);
                ug.i.j(r0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 21:
                uh.f.Q((uh.f) this.b, (Pair) obj);
                break;
            case 22:
                HashMap hashMap = ((vg.b) this.b).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 23:
                ((vg.e) this.b).F((TLObject) obj);
                break;
            case 24:
                HashMap hashMap2 = ((vg.h) this.b).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            case 25:
                vh.h hVar = (vh.h) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                Matrix matrix = hVar.K;
                if (hVar.T) {
                    hVar.I.recycle();
                    break;
                } else {
                    hVar.I = bitmap2;
                    Bitmap bitmap3 = hVar.I;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    hVar.J = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    Paint paint2 = new Paint(2);
                    hVar.L = paint2;
                    paint2.setShader(hVar.J);
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, h6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, h6.I.q() ? 0.02f : -0.15f);
                    hVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    hVar.J.setLocalMatrix(matrix);
                    break;
                }
            case 26:
                ((yh.m1) this.b).a();
                break;
            case 27:
                ((h4) this.b).e0(((Boolean) obj).booleanValue());
                break;
            case 28:
                f4 f4Var = (f4) this.b;
                ((Boolean) obj).getClass();
                y3 y3Var = f4Var.d;
                if (y3Var != null) {
                    y3Var.run();
                    break;
                }
                break;
            default:
                ug.i.j(((y4) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
        }
    }
}
