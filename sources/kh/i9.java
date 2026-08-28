package kh;

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
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.an0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.z41;
import org.telegram.ui.ai1;
import org.telegram.ui.dy;
import org.telegram.ui.mx;
import org.telegram.ui.qn;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i9(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        z41 z41Var;
        z41 z41Var2;
        z41 z41Var3;
        int i9;
        switch (this.a) {
            case 0:
                ((j9) this.b).n.S.D = ((Integer) obj).intValue();
                break;
            case 1:
                ((ra) this.b).g((Utilities.Callback) obj);
                break;
            case 2:
                mh.t tVar = (mh.t) this.b;
                ArrayList arrayList = tVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                i51 i51Var = tVar.a;
                if (i51Var != null && (z41Var = i51Var.U2) != null) {
                    z41Var.N(true);
                    break;
                }
                break;
            case 3:
                nh.f fVar = (nh.f) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = fVar.h;
                boolean z10 = arrayList3 == null || arrayList3.isEmpty();
                fVar.h = arrayList2;
                i51 i51Var2 = fVar.e;
                if (i51Var2 != null) {
                    i51Var2.U2.N(z10);
                    break;
                }
                break;
            case 4:
                ((of.m) this.b).L((TLRPC.User) obj);
                break;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                an0 an0Var = (an0) ((of.f0) this.b);
                mx mxVar = an0Var.G0;
                if (user != null) {
                    dy dyVar = mxVar.F0;
                    if (dyVar != null) {
                        dyVar.K3();
                    }
                    MessagesController.getInstance(mxVar.D0).openApp(user, 0);
                    an0Var.R(user.id, user);
                    break;
                }
                break;
            case 6:
                AndroidUtilities.hideKeyboard((mt) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 7:
                org.telegram.ui.web.v0 v0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                v0Var.d(sb2.toString());
                break;
            case 8:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                c1Var.e = (ArrayList) obj;
                c51 c51Var = c1Var.a;
                if (c51Var.C) {
                    c51Var.U2.N(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) this.b;
                u1Var.n = ((ArrayList) obj).size();
                c51 c51Var2 = u1Var.a;
                if (c51Var2 != null && (z41Var2 = c51Var2.U2) != null && c51Var2.C) {
                    z41Var2.N(true);
                    break;
                }
                break;
            case 10:
                pf.l lVar = (pf.l) this.b;
                boolean z11 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (lVar.B != z11) {
                    lVar.B = z11;
                    if (!z11) {
                        lVar.a.x0(0);
                        break;
                    }
                }
                break;
            case 11:
                AndroidUtilities.forEachViews((RecyclerView) ((pf.e0) this.b).s, (d5.d) new ih.e(16));
                break;
            case 12:
                pf.m0 m0Var = (pf.m0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                m0Var.C = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : m0Var.C.connected_bots.get(0);
                m0Var.D = tL_connectedBot;
                m0Var.I = tL_connectedBot == null ? null : m0Var.getMessagesController().getUser(Long.valueOf(m0Var.D.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = m0Var.D;
                m0Var.F = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = m0Var.D;
                m0Var.E = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                pf.x xVar = m0Var.v;
                if (xVar != null) {
                    xVar.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                i51 i51Var3 = m0Var.c;
                if (i51Var3 != null && (z41Var3 = i51Var3.U2) != null) {
                    z41Var3.N(true);
                }
                m0Var.X(true);
                m0Var.P = true;
                break;
            case 13:
                pf.o0 o0Var = (pf.o0) this.b;
                o0Var.w = o0Var.e[((Integer) obj).intValue()];
                o0Var.U(true);
                break;
            case 14:
                pf.n1 n1Var = (pf.n1) this.b;
                n1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", n1Var.getUserConfig().getClientUserId());
                bundle.putString("quick_reply", (String) obj);
                qn qnVar = new qn(bundle);
                qnVar.y9 = true;
                n1Var.presentFragment(qnVar);
                break;
            case 15:
                AndroidUtilities.hideKeyboard((pf.h1) this.b);
                AndroidUtilities.runOnUIThread((Runnable) obj, 80L);
                break;
            case 16:
                qh.f3 f3Var = (qh.f3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = f3Var.b;
                int i11 = f3Var.a;
                qh.o3 o3Var = f3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList4 = o3Var.h3;
                    ArrayList arrayList5 = o3Var.h3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        qh.b2 b2Var = o3Var.F3;
                        if (b2Var != null) {
                            b2Var.d();
                        }
                        qh.c3 c3Var = o3Var.j3;
                        if (c3Var != null) {
                            c3Var.f(false);
                        }
                        qh.a aVar = (qh.a) arrayList5.get(i11);
                        qh.a aVar2 = (qh.a) arrayList5.get(i10);
                        String M4 = qh.o3.A3(aVar.b) ? o3Var.M4(aVar) : "";
                        CharSequence M42 = qh.o3.A3(aVar2.b) ? o3Var.M4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M4.subSequence(0, Math.max(0, Math.min(f3Var.c, M4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M42.subSequence(Math.max(0, Math.min(f3Var.d, M42.length())), M42.length()));
                        ArrayList arrayList6 = new ArrayList();
                        qh.o3.W2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            qh.s5.e(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new qh.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                qh.a aVar3 = (qh.a) arrayList6.get(0);
                                if (qh.o3.A3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) qh.s5.A(aVar3.b));
                                    qh.s5.e(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    qh.s5.e(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new qh.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                qh.a aVar4 = (qh.a) j3.r0.j(1, arrayList6);
                                if (qh.o3.A3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(qh.s5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    qh.s5.e(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    qh.s5.e(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new qh.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = o3Var.g3;
                        if (richMessage2 == null) {
                            o3Var.g3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                o3Var.g3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            o3Var.v4((qh.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        o3Var.s4();
                        o3Var.U2.N(false);
                        qh.b2 b2Var2 = o3Var.F3;
                        if (b2Var2 != null) {
                            b2Var2.h();
                        }
                        o3Var.d3.onContentChanged();
                        o3Var.post(new ai1(24, f3Var, arrayList6.isEmpty() ? null : (qh.a) j3.r0.j(1, arrayList6)));
                        break;
                    }
                }
                break;
            case 17:
                ((qh.k) this.b).a.r.U1((TL_iv.RichMessage) obj);
                break;
            case 18:
                ((qh.x1) this.b).L.U1((TL_iv.RichMessage) obj);
                break;
            case 19:
                qh.o3 o3Var2 = (qh.o3) this.b;
                String str = (String) obj;
                o3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    o3Var2.R1(pageblockmath);
                    break;
                }
                break;
            case 20:
                xf.d0 d0Var = (xf.d0) this.b;
                xf.f1 f1Var = (xf.f1) obj;
                xf.c1 c1Var2 = d0Var.a;
                if (f1Var != null) {
                    float currentWeight = c1Var2.getCurrentWeight();
                    f1Var.f = currentWeight;
                    double d = d0Var.p;
                    if (d > 0.0d) {
                        f1Var.f = (float) ((d / d0Var.q) * currentWeight);
                    }
                    if (f1Var.a.o() == 4) {
                        f1Var.k *= f1Var.f;
                    }
                }
                xf.q0 painting = c1Var2.getPainting();
                if (painting.L == null) {
                    painting.f.f(new xf.l0(painting, f1Var, 1));
                    break;
                }
                break;
            case 21:
                xg.i iVar = (xg.i) this.b;
                if (((xg.b) obj) == xg.b.d && ((i9 = iVar.s) == 2 || i9 == 3)) {
                    iVar.s = 1;
                }
                iVar.h.run();
                break;
            case 22:
                s5 s5Var = (s5) this.b;
                TextureView textureView = (TextureView) obj;
                s5Var.s0 = textureView;
                if (textureView != null) {
                    s5Var.m0.addView(textureView, 0);
                    break;
                }
                break;
            case 23:
                yf.t2 t2Var = (yf.t2) this.b;
                t2Var.n = (Bitmap) obj;
                Paint paint = new Paint(1);
                t2Var.s = paint;
                Bitmap bitmap = t2Var.n;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t2Var.r = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? 0.08f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? -0.02f : -0.07f);
                t2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                t2Var.v = new Matrix();
                break;
            case 24:
                yg.c cVar = (yg.c) this.b;
                yg.e eVar = (yg.e) obj;
                cVar.h = eVar;
                cVar.c.a(eVar, true);
                AndroidUtilities.runOnUIThread(new pf.o1(cVar, 21), 200L);
                break;
            case 25:
                ((zf.j0) this.b).E1((HashMap) obj);
                break;
            default:
                zf.w1 w1Var = (zf.w1) this.b;
                boolean isEnabled = LiteMode.isEnabled(131072);
                if (w1Var.d != isEnabled) {
                    w1Var.d = isEnabled;
                    w1Var.invalidate();
                    break;
                }
                break;
        }
    }
}
