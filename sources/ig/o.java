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
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.q5;
import java.util.ArrayList;
import java.util.HashMap;
import li.d6;
import li.f2;
import li.j3;
import li.m3;
import li.v3;
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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.xo0;
import org.telegram.ui.Components.yb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ey;
import org.telegram.ui.mx;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;
import org.telegram.ui.wn;
import sg.u2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        k71 k71Var;
        k71 k71Var2;
        int i10;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        switch (this.a) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj;
                xo0 xo0Var = (xo0) ((i0) this.b);
                mx mxVar = xo0Var.K0;
                if (user != null) {
                    ey eyVar = mxVar.L0;
                    if (eyVar != null) {
                        eyVar.S3();
                    }
                    MessagesController.getInstance(mxVar.J0).openApp(user, 0);
                    xo0Var.Q(user.id, user);
                    break;
                }
                break;
            case 1:
                ii.f fVar = (ii.f) this.b;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = fVar.n;
                boolean z10 = arrayList2 == null || arrayList2.isEmpty();
                fVar.n = arrayList;
                s71 s71Var = fVar.f;
                if (s71Var != null) {
                    s71Var.g3.O(z10);
                    break;
                }
                break;
            case 2:
                jg.n nVar = (jg.n) this.b;
                boolean z11 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (nVar.F != z11) {
                    nVar.F = z11;
                    if (!z11) {
                        nVar.a.y0(0);
                        break;
                    }
                }
                break;
            case 3:
                AndroidUtilities.forEachViews((RecyclerView) ((jg.i0) this.b).s, (Utilities.Callback<View>) new di.e(3));
                break;
            case 4:
                jg.t0 t0Var = (jg.t0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                t0Var.G = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : t0Var.G.connected_bots.get(0);
                t0Var.H = tL_connectedBot;
                t0Var.M = tL_connectedBot == null ? null : t0Var.getMessagesController().getUser(Long.valueOf(t0Var.H.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = t0Var.H;
                t0Var.J = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = t0Var.H;
                t0Var.I = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                jg.b0 b0Var = t0Var.v;
                if (b0Var != null) {
                    b0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                s71 s71Var2 = t0Var.c;
                if (s71Var2 != null && (k71Var = s71Var2.g3) != null) {
                    k71Var.O(true);
                }
                t0Var.Z(true);
                t0Var.T = true;
                break;
            case 5:
                jg.v0 v0Var = (jg.v0) this.b;
                v0Var.v = v0Var.d[((Integer) obj).intValue()];
                v0Var.W(true);
                break;
            case 6:
                jg.z1 z1Var = (jg.z1) this.b;
                z1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", z1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                wn wnVar = new wn(bundle);
                wnVar.S9 = true;
                z1Var.presentFragment(wnVar);
                break;
            case 7:
                AndroidUtilities.hideKeyboard((jg.s1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 8:
                m3 m3Var = (m3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i11 = m3Var.b;
                int i12 = m3Var.a;
                v3 v3Var = m3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList3 = v3Var.t3;
                    ArrayList arrayList4 = v3Var.t3;
                    if (i12 < arrayList3.size() && i11 < arrayList4.size()) {
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
                        }
                        j3 j3Var = v3Var.v3;
                        if (j3Var != null) {
                            j3Var.f(false);
                        }
                        li.a aVar = (li.a) arrayList4.get(i12);
                        li.a aVar2 = (li.a) arrayList4.get(i11);
                        String S4 = v3.G3(aVar.b) ? v3Var.S4(aVar) : "";
                        CharSequence S42 = v3.G3(aVar2.b) ? v3Var.S4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(S4.subSequence(0, Math.max(0, Math.min(m3Var.c, S4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(S42.subSequence(Math.max(0, Math.min(m3Var.d, S42.length())), S42.length()));
                        ArrayList arrayList5 = new ArrayList();
                        v3.c3(arrayList5, richMessage.blocks, null);
                        if (arrayList5.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            d6.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList5.add(new li.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                li.a aVar3 = (li.a) arrayList5.get(0);
                                if (v3.G3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) d6.z(aVar3.b));
                                    d6.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    d6.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList5.add(0, new li.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                li.a aVar4 = (li.a) ic.a.g(1, arrayList5);
                                if (v3.G3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(d6.z(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    d6.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    d6.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList5.add(new li.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = v3Var.s3;
                        if (richMessage2 == null) {
                            v3Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList6 = richMessage.photos;
                            if (arrayList6 != null) {
                                richMessage2.photos.addAll(arrayList6);
                            }
                            ArrayList<TLRPC.Document> arrayList7 = richMessage.documents;
                            if (arrayList7 != null) {
                                v3Var.s3.documents.addAll(arrayList7);
                            }
                        }
                        for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                            v3Var.B4((li.a) arrayList5.get(i13));
                        }
                        while (i11 >= i12) {
                            arrayList4.remove(i11);
                            i11--;
                        }
                        arrayList4.addAll(i12, arrayList5);
                        v3Var.y4();
                        v3Var.g3.O(false);
                        f2 f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        v3Var.p3.onContentChanged();
                        v3Var.post(new k2.e0(6, m3Var, arrayList5.isEmpty() ? null : (li.a) ic.a.g(1, arrayList5)));
                        break;
                    }
                }
                break;
            case 9:
                ((li.l) this.b).a.r.a2((TL_iv.RichMessage) obj);
                break;
            case 10:
                ((li.b2) this.b).P.a2((TL_iv.RichMessage) obj);
                break;
            case 11:
                v3 v3Var2 = (v3) this.b;
                String str = (String) obj;
                v3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    v3Var2.X1(pageblockmath);
                    break;
                }
                break;
            case 12:
                AndroidUtilities.hideKeyboard((ju) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 13:
                org.telegram.ui.web.x0 x0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                x0Var.d(sb2.toString());
                break;
            case 14:
                org.telegram.ui.web.f1 f1Var = (org.telegram.ui.web.f1) this.b;
                f1Var.f = (ArrayList) obj;
                m71 m71Var = f1Var.a;
                if (m71Var.G) {
                    m71Var.g3.O(true);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.b;
                y1Var.r = ((ArrayList) obj).size();
                m71 m71Var2 = y1Var.a;
                if (m71Var2 != null && (k71Var2 = m71Var2.g3) != null && m71Var2.G) {
                    k71Var2.O(true);
                    break;
                }
                break;
            case 16:
                rg.e0 e0Var = (rg.e0) this.b;
                rg.f1 f1Var2 = (rg.f1) obj;
                rg.c1 c1Var = e0Var.a;
                if (f1Var2 != null) {
                    float currentWeight = c1Var.getCurrentWeight();
                    f1Var2.f = currentWeight;
                    double d = e0Var.p;
                    if (d > 0.0d) {
                        f1Var2.f = (float) ((d / e0Var.q) * currentWeight);
                    }
                    if (f1Var2.a.o() == 4) {
                        f1Var2.k *= f1Var2.f;
                    }
                }
                rg.q0 painting = c1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new rg.m0(painting, f1Var2, 1));
                    break;
                }
                break;
            case 17:
                rh.i iVar = (rh.i) this.b;
                if (((rh.b) obj) == rh.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 18:
                q5 q5Var = (q5) this.b;
                TextureView textureView = (TextureView) obj;
                q5Var.w0 = textureView;
                if (textureView != null) {
                    q5Var.q0.addView(textureView, 0);
                    break;
                }
                break;
            case 19:
                u2 u2Var = (u2) this.b;
                u2Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                u2Var.s = paint;
                Bitmap bitmap = u2Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                u2Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, y6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, y6.I.q() ? -0.02f : -0.07f);
                u2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                u2Var.v = new Matrix();
                break;
            case 20:
                sh.c cVar = (sh.c) this.b;
                sh.e eVar = (sh.e) obj;
                cVar.h = eVar;
                cVar.c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.h1(cVar, 20), 200L);
                break;
            case 21:
                ((tg.j0) this.b).I1((HashMap) obj);
                break;
            case 22:
                tg.x1 x1Var = (tg.x1) this.b;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (x1Var.e != isEnabled) {
                    x1Var.e = isEnabled;
                    x1Var.invalidate();
                    break;
                }
                break;
            case 23:
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
                r2 R = LaunchActivity.R();
                if (R != null) {
                    String b10 = vg.j.b(messageObject);
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
                    boolean z12 = chat != null && ChatObject.isChannelAndNotMegaGroup(chat);
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
                    ocVar.b = new fi.r1(payments_giveawayinfo, z12, b10, j10, tL_messageMediaGiveaway2, R);
                    ybVar.setButton(ocVar);
                    qc.g(R, ybVar, 2750).j();
                    break;
                }
                break;
            case 24:
                vg.s0 s0Var = (vg.s0) this.b;
                s0Var.a0.setLoading(false);
                vg.j.j(s0Var.getContext(), (TLRPC.TL_error) obj);
                break;
            case 25:
                vh.f.P((vh.f) this.b, (Pair) obj);
                break;
            case 26:
                HashMap hashMap = ((wg.b) this.b).w;
                hashMap.clear();
                hashMap.putAll((HashMap) obj);
                break;
            case 27:
                ((wg.e) this.b).F((TLObject) obj);
                break;
            case 28:
                HashMap hashMap2 = ((wg.h) this.b).r;
                hashMap2.clear();
                hashMap2.putAll((HashMap) obj);
                break;
            default:
                wh.h hVar = (wh.h) this.b;
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
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, y6.I.q() ? 0.08f : 1.25f);
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, y6.I.q() ? 0.02f : -0.15f);
                    hVar.L.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                    matrix.reset();
                    matrix.setScale(15.0f, 15.0f);
                    hVar.J.setLocalMatrix(matrix);
                    break;
                }
        }
    }
}
