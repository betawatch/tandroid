package lh;

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
import android.view.TextureView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.a61;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.lt;
import org.telegram.ui.gy;
import org.telegram.ui.px;
import org.telegram.ui.rn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n6 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        b51 b51Var;
        b51 b51Var2;
        b51 b51Var3;
        int i10;
        switch (this.a) {
            case 0:
                y7 y7Var = (y7) obj;
                a61 a61Var = ((q6) this.b).n;
                if (a61Var != null) {
                    a61Var.setHDRInfo(y7Var);
                    break;
                }
                break;
            case 1:
                j8 j8Var = (j8) this.b;
                zf.m0 m0Var = (zf.m0) obj;
                if (m0Var == null) {
                    j8Var.U();
                    break;
                } else {
                    j8Var.k0 = m0Var.e;
                    j8Var.j0 = m0Var.f;
                    break;
                }
            case 2:
                ((f9) this.b).n.S.D = ((Integer) obj).intValue();
                break;
            case 3:
                ((oa) this.b).g((Utilities.Callback) obj);
                break;
            case 4:
                nh.s sVar = (nh.s) this.b;
                ArrayList arrayList = sVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                k51 k51Var = sVar.a;
                if (k51Var != null && (b51Var = k51Var.U2) != null) {
                    b51Var.N(true);
                    break;
                }
                break;
            case 5:
                oh.f fVar = (oh.f) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = fVar.h;
                boolean z10 = arrayList3 == null || arrayList3.isEmpty();
                fVar.h = arrayList2;
                k51 k51Var2 = fVar.e;
                if (k51Var2 != null) {
                    k51Var2.U2.N(z10);
                    break;
                }
                break;
            case 6:
                AndroidUtilities.hideKeyboard((lt) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 7:
                org.telegram.ui.web.w0 w0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                w0Var.d(sb2.toString());
                break;
            case 8:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) this.b;
                d1Var.e = (ArrayList) obj;
                e51 e51Var = d1Var.a;
                if (e51Var.C) {
                    e51Var.U2.N(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.b;
                v1Var.n = ((ArrayList) obj).size();
                e51 e51Var2 = v1Var.a;
                if (e51Var2 != null && (b51Var2 = e51Var2.U2) != null && e51Var2.C) {
                    b51Var2.N(true);
                    break;
                }
                break;
            case 10:
                ((pf.k) this.b).L((TLRPC.User) obj);
                break;
            case 11:
                TLRPC.User user = (TLRPC.User) obj;
                cn0 cn0Var = (cn0) ((pf.z) this.b);
                px pxVar = cn0Var.G0;
                if (user != null) {
                    gy gyVar = pxVar.F0;
                    if (gyVar != null) {
                        gyVar.K3();
                    }
                    MessagesController.getInstance(pxVar.D0).openApp(user, 0);
                    cn0Var.R(user.id, user);
                    break;
                }
                break;
            case 12:
                qf.m mVar = (qf.m) this.b;
                boolean z11 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (mVar.B != z11) {
                    mVar.B = z11;
                    if (!z11) {
                        mVar.a.x0(0);
                        break;
                    }
                }
                break;
            case 13:
                AndroidUtilities.forEachViews((RecyclerView) ((qf.e0) this.b).s, (d5.d) new j4.w0(16));
                break;
            case 14:
                qf.m0 m0Var2 = (qf.m0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                m0Var2.C = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : m0Var2.C.connected_bots.get(0);
                m0Var2.D = tL_connectedBot;
                m0Var2.I = tL_connectedBot == null ? null : m0Var2.getMessagesController().getUser(Long.valueOf(m0Var2.D.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = m0Var2.D;
                m0Var2.F = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = m0Var2.D;
                m0Var2.E = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                qf.x xVar = m0Var2.v;
                if (xVar != null) {
                    xVar.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                k51 k51Var3 = m0Var2.c;
                if (k51Var3 != null && (b51Var3 = k51Var3.U2) != null) {
                    b51Var3.N(true);
                }
                m0Var2.Y(true);
                m0Var2.P = true;
                break;
            case 15:
                qf.o0 o0Var = (qf.o0) this.b;
                o0Var.w = o0Var.e[((Integer) obj).intValue()];
                o0Var.V(true);
                break;
            case 16:
                qf.n1 n1Var = (qf.n1) this.b;
                n1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", n1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                rn rnVar = new rn(bundle);
                rnVar.y9 = true;
                n1Var.presentFragment(rnVar);
                break;
            case 17:
                AndroidUtilities.hideKeyboard((qf.h1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 18:
                rh.g3 g3Var = (rh.g3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i11 = g3Var.b;
                int i12 = g3Var.a;
                rh.p3 p3Var = g3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList4 = p3Var.h3;
                    ArrayList arrayList5 = p3Var.h3;
                    if (i12 < arrayList4.size() && i11 < arrayList5.size()) {
                        rh.b2 b2Var = p3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        rh.d3 d3Var = p3Var.j3;
                        if (d3Var != null) {
                            d3Var.f(false);
                        }
                        rh.a aVar = (rh.a) arrayList5.get(i12);
                        rh.a aVar2 = (rh.a) arrayList5.get(i11);
                        String M4 = rh.p3.A3(aVar.b) ? p3Var.M4(aVar) : "";
                        CharSequence M42 = rh.p3.A3(aVar2.b) ? p3Var.M4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(0, Math.max(0, Math.min(g3Var.c, M4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M42.subSequence(Math.max(0, Math.min(g3Var.d, M42.length())), M42.length()));
                        ArrayList arrayList6 = new ArrayList();
                        rh.p3.W2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            rh.t5.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new rh.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                rh.a aVar3 = (rh.a) arrayList6.get(0);
                                if (rh.p3.A3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) rh.t5.A(aVar3.b));
                                    rh.t5.e(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    rh.t5.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new rh.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                rh.a aVar4 = (rh.a) i0.a.i(1, arrayList6);
                                if (rh.p3.A3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(rh.t5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    rh.t5.e(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    rh.t5.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new rh.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = p3Var.g3;
                        if (richMessage2 == null) {
                            p3Var.g3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                p3Var.g3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i13 = 0; i13 < arrayList6.size(); i13++) {
                            p3Var.v4((rh.a) arrayList6.get(i13));
                        }
                        while (i11 >= i12) {
                            arrayList5.remove(i11);
                            i11--;
                        }
                        arrayList5.addAll(i12, arrayList6);
                        p3Var.s4();
                        p3Var.U2.N(false);
                        rh.b2 b2Var2 = p3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        p3Var.d3.onContentChanged();
                        p3Var.post(new rh.o2(1, g3Var, arrayList6.isEmpty() ? null : (rh.a) i0.a.i(1, arrayList6)));
                        break;
                    }
                }
                break;
            case 19:
                ((rh.k) this.b).a.r.U1((TL_iv.RichMessage) obj);
                break;
            case 20:
                ((rh.x1) this.b).L.U1((TL_iv.RichMessage) obj);
                break;
            case 21:
                rh.p3 p3Var2 = (rh.p3) this.b;
                String str = (String) obj;
                p3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    p3Var2.R1(pageblockmath);
                    break;
                }
                break;
            case 22:
                yf.d0 d0Var = (yf.d0) this.b;
                yf.e1 e1Var = (yf.e1) obj;
                yf.b1 b1Var = d0Var.a;
                if (e1Var != null) {
                    float currentWeight = b1Var.getCurrentWeight();
                    e1Var.f = currentWeight;
                    double d = d0Var.p;
                    if (d > 0.0d) {
                        e1Var.f = (float) ((d / d0Var.q) * currentWeight);
                    }
                    if (e1Var.a.o() == 4) {
                        e1Var.k *= e1Var.f;
                    }
                }
                yf.p0 painting = b1Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new yf.l0(painting, e1Var, 1));
                    break;
                }
                break;
            case 23:
                yg.i iVar = (yg.i) this.b;
                if (((yg.b) obj) == yg.b.d && ((i10 = iVar.s) == 2 || i10 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 24:
                r5 r5Var = (r5) this.b;
                TextureView textureView = (TextureView) obj;
                r5Var.s0 = textureView;
                if (textureView != null) {
                    r5Var.m0.addView(textureView, 0);
                    break;
                }
                break;
            case 25:
                zf.t2 t2Var = (zf.t2) this.b;
                t2Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.s = paint;
                Bitmap bitmap = t2Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.07f);
                t2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                break;
            default:
                zg.c cVar = (zg.c) this.b;
                zg.e eVar = (zg.e) obj;
                cVar.h = eVar;
                cVar.c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new qf.b(cVar, 28), 200L);
                break;
        }
    }
}
