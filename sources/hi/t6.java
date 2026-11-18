package hi;

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
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.z41;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.kw;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class t6 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        z41 z41Var;
        z41 z41Var2;
        z41 z41Var3;
        int i7;
        switch (this.a) {
            case 0:
                v6 v6Var = (v6) this.b;
                Long l10 = (Long) obj;
                v6Var.A2 = false;
                TLRPC.User c22 = l10 == null ? null : mp.u1(v6Var.a).c2(l10);
                v6Var.z2 = c22;
                v6Var.B2 = c22 == null;
                if (c22 != null) {
                    v6Var.h1();
                    break;
                }
                break;
            case 1:
                l7 l7Var = (l7) this.b;
                tg.h0 h0Var = (tg.h0) obj;
                if (h0Var == null) {
                    l7Var.f1();
                    break;
                } else {
                    l7Var.k2 = h0Var.e;
                    l7Var.j2 = h0Var.f;
                    break;
                }
            case 2:
                ((h8) this.b).n.a0.C1 = ((Integer) obj).intValue();
                break;
            case 3:
                ((q9) this.b).h((x10) obj);
                break;
            case 4:
                ((jg.m) this.b).M((TLRPC.User) obj);
                break;
            case 5:
                TLRPC.User user = (TLRPC.User) obj;
                km0 km0Var = (km0) ((jg.h0) this.b);
                kw kwVar = km0Var.L0;
                if (user != null) {
                    cx cxVar = kwVar.M0;
                    if (cxVar != null) {
                        cxVar.W3();
                    }
                    mp.u1(kwVar.K0).E3(null, user, null, 0, null, false, false);
                    km0Var.Q(user.id, user);
                    break;
                }
                break;
            case 6:
                ((ji.m) ((xi.e) this.b).d).k(obj);
                break;
            case 7:
                kg.n nVar = (kg.n) this.b;
                boolean z10 = ((Integer) obj).intValue() > org.telegram.messenger.g0.L(20.0f);
                if (nVar.G != z10) {
                    nVar.G = z10;
                    if (!z10) {
                        nVar.a.y0(0);
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.messenger.g0.d0(((kg.g0) this.b).s, new fi.e(3));
                break;
            case 9:
                kg.t0 t0Var = (kg.t0) this.b;
                TL_account.connectedBots connectedbots = (TL_account.connectedBots) obj;
                t0Var.H = connectedbots;
                TL_account.TL_connectedBot tL_connectedBot = (connectedbots == null || connectedbots.connected_bots.isEmpty()) ? null : t0Var.H.connected_bots.get(0);
                t0Var.I = tL_connectedBot;
                t0Var.N = tL_connectedBot == null ? null : t0Var.getMessagesController().c2(Long.valueOf(t0Var.I.bot_id));
                TL_account.TL_connectedBot tL_connectedBot2 = t0Var.I;
                t0Var.K = tL_connectedBot2 != null ? TL_account.TL_businessBotRights.clone(tL_connectedBot2.rights) : TL_account.TL_businessBotRights.makeDefault();
                TL_account.TL_connectedBot tL_connectedBot3 = t0Var.I;
                t0Var.J = tL_connectedBot3 != null ? tL_connectedBot3.recipients.exclude_selected : true;
                kg.a0 a0Var = t0Var.w;
                if (a0Var != null) {
                    a0Var.i(tL_connectedBot3 != null ? tL_connectedBot3.recipients : null);
                }
                e51 e51Var = t0Var.c;
                if (e51Var != null && (z41Var = e51Var.g3) != null) {
                    z41Var.O(true);
                }
                t0Var.d0(true);
                t0Var.U = true;
                break;
            case 10:
                kg.v0 v0Var = (kg.v0) this.b;
                v0Var.w = v0Var.d[((Integer) obj).intValue()];
                v0Var.a0(true);
                break;
            case 11:
                kg.t1 t1Var = (kg.t1) this.b;
                t1Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("chatMode", 5);
                bundle.putLong("user_id", t1Var.getUserConfig().e());
                bundle.putString("quick_reply", (String) obj);
                bn bnVar = new bn(bundle);
                bnVar.Z9 = true;
                t1Var.presentFragment(bnVar);
                break;
            case 12:
                org.telegram.messenger.g0.v1((kg.a1) this.b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                break;
            case 13:
                ki.r rVar = (ki.r) this.b;
                ArrayList arrayList = rVar.b;
                arrayList.clear();
                arrayList.addAll((ArrayList) obj);
                e51 e51Var2 = rVar.a;
                if (e51Var2 != null && (z41Var2 = e51Var2.g3) != null) {
                    z41Var2.O(true);
                    break;
                }
                break;
            case 14:
                li.g gVar = (li.g) this.b;
                ArrayList arrayList2 = (ArrayList) obj;
                ArrayList arrayList3 = gVar.n;
                boolean z11 = arrayList3 == null || arrayList3.isEmpty();
                gVar.n = arrayList2;
                e51 e51Var3 = gVar.f;
                if (e51Var3 != null) {
                    e51Var3.g3.O(z11);
                    break;
                }
                break;
            case 15:
                oi.j3 j3Var = (oi.j3) this.b;
                TL_iv.RichMessage richMessage = (TL_iv.RichMessage) obj;
                int i10 = j3Var.b;
                int i11 = j3Var.a;
                oi.s3 s3Var = j3Var.e;
                if (richMessage != null) {
                    ArrayList arrayList4 = s3Var.t3;
                    ArrayList arrayList5 = s3Var.t3;
                    if (i11 < arrayList4.size() && i10 < arrayList5.size()) {
                        oi.e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
                        }
                        oi.g3 g3Var = s3Var.v3;
                        if (g3Var != null) {
                            g3Var.f(false);
                        }
                        oi.a aVar = (oi.a) arrayList5.get(i11);
                        oi.a aVar2 = (oi.a) arrayList5.get(i10);
                        String P4 = oi.s3.D3(aVar.b) ? s3Var.P4(aVar) : "";
                        CharSequence P42 = oi.s3.D3(aVar2.b) ? s3Var.P4(aVar2) : "";
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(P4.subSequence(0, Math.max(0, Math.min(j3Var.c, P4.length()))));
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(P42.subSequence(Math.max(0, Math.min(j3Var.d, P42.length())), P42.length()));
                        ArrayList arrayList6 = new ArrayList();
                        oi.s3.Z2(arrayList6, richMessage.blocks, null);
                        if (arrayList6.isEmpty()) {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
                            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
                            TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                            oi.z5.d(pageblockparagraph, spannableStringBuilder3);
                            arrayList6.add(new oi.a(pageblockparagraph, aVar.c, aVar.d));
                        } else {
                            if (spannableStringBuilder.length() > 0) {
                                oi.a aVar3 = (oi.a) arrayList6.get(0);
                                if (oi.s3.D3(aVar3.b)) {
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(spannableStringBuilder);
                                    spannableStringBuilder4.append((CharSequence) oi.z5.A(aVar3.b));
                                    oi.z5.d(aVar3.b, spannableStringBuilder4);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                                    oi.z5.d(pageblockparagraph2, spannableStringBuilder);
                                    arrayList6.add(0, new oi.a(pageblockparagraph2, aVar.c, aVar.d));
                                }
                            }
                            if (spannableStringBuilder2.length() > 0) {
                                oi.a aVar4 = (oi.a) i5.c.h(1, arrayList6);
                                if (oi.s3.D3(aVar4.b)) {
                                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(oi.z5.A(aVar4.b));
                                    spannableStringBuilder5.append((CharSequence) spannableStringBuilder2);
                                    oi.z5.d(aVar4.b, spannableStringBuilder5);
                                } else {
                                    TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                                    oi.z5.d(pageblockparagraph3, spannableStringBuilder2);
                                    arrayList6.add(new oi.a(pageblockparagraph3, aVar2.c, aVar2.d));
                                }
                            }
                        }
                        TL_iv.RichMessage richMessage2 = s3Var.s3;
                        if (richMessage2 == null) {
                            s3Var.s3 = richMessage;
                        } else {
                            ArrayList<TLRPC.Photo> arrayList7 = richMessage.photos;
                            if (arrayList7 != null) {
                                richMessage2.photos.addAll(arrayList7);
                            }
                            ArrayList<TLRPC.Document> arrayList8 = richMessage.documents;
                            if (arrayList8 != null) {
                                s3Var.s3.documents.addAll(arrayList8);
                            }
                        }
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            s3Var.y4((oi.a) arrayList6.get(i12));
                        }
                        while (i10 >= i11) {
                            arrayList5.remove(i10);
                            i10--;
                        }
                        arrayList5.addAll(i11, arrayList6);
                        s3Var.v4();
                        s3Var.g3.O(false);
                        oi.e2 e2Var2 = s3Var.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                        }
                        s3Var.p3.onContentChanged();
                        s3Var.post(new oi.s2(2, j3Var, arrayList6.isEmpty() ? null : (oi.a) i5.c.h(1, arrayList6)));
                        break;
                    }
                }
                break;
            case 16:
                ((oi.k) this.b).a.r.Y1((TL_iv.RichMessage) obj);
                break;
            case 17:
                ((oi.z1) this.b).Q.Y1((TL_iv.RichMessage) obj);
                break;
            case 18:
                oi.s3 s3Var2 = (oi.s3) this.b;
                String str = (String) obj;
                s3Var2.getClass();
                if (!TextUtils.isEmpty(str)) {
                    TL_iv.pageBlockMath pageblockmath = new TL_iv.pageBlockMath();
                    pageblockmath.source = str;
                    s3Var2.V1(pageblockmath);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.b;
                Bitmap bitmap = (Bitmap) obj;
                Paint paint = w0Var.G;
                w0Var.a0 = false;
                w0Var.f = bitmap;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                w0Var.h = new BitmapShader(bitmap, tileMode, tileMode);
                Matrix matrix = w0Var.n;
                if (matrix == null) {
                    w0Var.n = new Matrix();
                } else {
                    matrix.reset();
                }
                w0Var.n.postScale(8.0f, 8.0f);
                Matrix matrix2 = w0Var.n;
                int[] iArr = w0Var.r;
                matrix2.postTranslate(-iArr[0], -iArr[1]);
                w0Var.h.setLocalMatrix(w0Var.n);
                paint.setShader(w0Var.h);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, -0.2f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                w0Var.invalidate();
                break;
            case 20:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.b;
                Bitmap bitmap2 = (Bitmap) obj;
                if (bitmap2 == null) {
                    u1Var.getClass();
                    break;
                } else {
                    if (u1Var.G0 == null) {
                        u1Var.G0 = new Paint(1);
                    }
                    u1Var.D0 = bitmap2;
                    Bitmap bitmap3 = u1Var.D0;
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode2, tileMode2);
                    u1Var.F0 = bitmapShader;
                    u1Var.G0.setShader(bitmapShader);
                    Matrix matrix3 = new Matrix();
                    u1Var.E0 = matrix3;
                    matrix3.postScale(8.0f, 8.0f);
                    Matrix matrix4 = u1Var.E0;
                    int[] iArr2 = u1Var.y0;
                    matrix4.postTranslate(-iArr2[0], -iArr2[1]);
                    u1Var.F0.setLocalMatrix(u1Var.E0);
                    u1Var.b1.invalidate();
                    break;
                }
            case 21:
                org.telegram.messenger.g0.v1((mt) this.b);
                org.telegram.messenger.g0.h3((Runnable) obj, 80L);
                break;
            case 22:
                org.telegram.ui.web.s0 s0Var = ((BotWebViewContainer$WebViewProxy) this.b).b;
                StringBuilder sb2 = new StringBuilder("window.navigator.__share__receive(");
                sb2.append(((Boolean) obj).booleanValue() ? "" : "'abort'");
                sb2.append(")");
                s0Var.d(sb2.toString());
                break;
            case 23:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.b;
                x0Var.f = (ArrayList) obj;
                bi.c6 c6Var = x0Var.a;
                if (c6Var.H) {
                    c6Var.g3.O(true);
                    break;
                }
                break;
            case 24:
                org.telegram.ui.web.n1 n1Var = (org.telegram.ui.web.n1) this.b;
                n1Var.r = ((ArrayList) obj).size();
                bi.c6 c6Var2 = n1Var.a;
                if (c6Var2 != null && (z41Var3 = c6Var2.g3) != null && c6Var2.H) {
                    z41Var3.O(true);
                    break;
                }
                break;
            case 25:
                rh.h hVar = (rh.h) this.b;
                if (((rh.b) obj) == rh.b.d && ((i7 = hVar.s) == 2 || i7 == 3)) {
                    hVar.s = 1;
                }
                hVar.h.run();
                break;
            case 26:
                sg.v vVar = (sg.v) this.b;
                sg.x0 x0Var2 = (sg.x0) obj;
                sg.u0 u0Var = vVar.a;
                if (x0Var2 != null) {
                    float currentWeight = u0Var.getCurrentWeight();
                    x0Var2.f = currentWeight;
                    double d = vVar.p;
                    if (d > 0.0d) {
                        x0Var2.f = (float) ((d / vVar.q) * currentWeight);
                    }
                    if (x0Var2.a.o() == 4) {
                        x0Var2.k *= x0Var2.f;
                    }
                }
                sg.i0 painting = u0Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new sg.d0(painting, x0Var2, 1));
                    break;
                }
                break;
            case 27:
                sh.c cVar = (sh.c) this.b;
                sh.d dVar = (sh.d) obj;
                cVar.h = dVar;
                cVar.c.b(dVar, true);
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.z0(cVar, 15), 200L);
                break;
            case 28:
                b5 b5Var = (b5) this.b;
                TextureView textureView = (TextureView) obj;
                b5Var.x0 = textureView;
                if (textureView != null) {
                    b5Var.r0.addView(textureView, 0);
                    break;
                }
                break;
            default:
                tg.k2 k2Var = (tg.k2) this.b;
                k2Var.n = (Bitmap) obj;
                Paint paint2 = new Paint(1);
                k2Var.s = paint2;
                Bitmap bitmap4 = k2Var.n;
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode3, tileMode3);
                k2Var.r = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? 0.08f : 0.25f);
                org.telegram.messenger.g0.h(colorMatrix2, org.telegram.ui.ActionBar.n6.I.q() ? -0.02f : -0.07f);
                k2Var.s.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                k2Var.w = new Matrix();
                break;
        }
    }
}
