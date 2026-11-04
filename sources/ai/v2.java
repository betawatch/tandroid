package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ci.e9;
import ei.c8;
import ei.r9;
import gi.f7;
import gi.m7;
import gi.o9;
import gi.va;
import gi.x9;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b20;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.je0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v2 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v2(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        String str;
        String str2;
        int i3;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                ((w2) this.b).a();
                break;
            case 1:
                ((i6) this.b).j0(((Boolean) obj).booleanValue());
                break;
            case 2:
                g6 g6Var = (g6) this.b;
                ((Boolean) obj).getClass();
                a6 a6Var = g6Var.d;
                if (a6Var != null) {
                    a6Var.run();
                    break;
                }
                break;
            case 3:
                xg.j.j(((d7) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 4:
                bi.s sVar = (bi.s) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (sVar.E == null) {
                    if (tL_messages_stickerSet == null || tL_messages_stickerSet.documents == null) {
                        sVar.G = true;
                    } else {
                        sVar.E = tL_messages_stickerSet;
                    }
                    sVar.e();
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.b;
                Long l10 = (Long) obj;
                if (!d2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        d2Var.presentFragment(ProfileActivity.A4(l10.longValue()), true);
                        break;
                    } else {
                        org.telegram.messenger.g0.h3(new y1(i12));
                        break;
                    }
                }
                break;
            case 6:
                bi.o0 o0Var = (bi.o0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                bi.a1 a1Var = o0Var.b;
                if (!o0Var.F && tL_exportedContactToken != null) {
                    o0Var.r = tL_exportedContactToken;
                    o0Var.s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = o0Var.c.b;
                    if (!TextUtils.equals(a1Var.f, str4) || a1Var.h) {
                        a1Var.f = str4;
                        a1Var.h = false;
                        a1Var.I5 = null;
                        a1Var.J5 = 0;
                    }
                    if (!TextUtils.equals(a1Var.d, str3)) {
                        a1Var.d = str3;
                        Utilities.e.c(new a1.f(20, str3, new bi.r0(a1Var, str3, 0)));
                    }
                    a1Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 7:
                bi.a1 a1Var2 = (bi.a1) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    a1Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        a1Var2.q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                a1Var2.invalidate();
                break;
            case 8:
                ci.t0 t0Var = (ci.t0) this.b;
                int i13 = ci.t0.q2[((Integer) obj).intValue()];
                if (t0Var.h2 != i13) {
                    t0Var.h2 = i13;
                    t0Var.Z1.setText(bd.G(i13 / 3600, "GiftOfferHours", new Object[0]));
                }
                t0Var.e1(true);
                break;
            case 9:
                ci.p1 p1Var = (ci.p1) this.b;
                p1Var.b2.g();
                p1Var.d2.O(true);
                break;
            case 10:
                ci.q4 q4Var = (ci.q4) this.b;
                q4Var.getClass();
                q4Var.s = new Matrix();
                q4Var.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                q4Var.r = bitmapShader;
                Paint paint = q4Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 11:
                e9.a((e9) this.b, (TL_stars.StarGifts) obj);
                break;
            case 12:
                ((org.telegram.ui.ActionBar.t2) this.b).a(((Boolean) obj).booleanValue());
                break;
            case 13:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i14 = starGift.availability_remains;
                        textView.setText(i14 <= 0 ? bd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : bd.K("Gift2Availability4Value", i14, ',', bd.E(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = bd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = bd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + bd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
            case 14:
                ei.g1 g1Var = (ei.g1) this.b;
                if (((Boolean) obj).booleanValue() && !g1Var.x) {
                    g1Var.n = true;
                    g1Var.J = true;
                    g1Var.u(false);
                    ei.g1.X = g1Var;
                    g1Var.K = NativeInstance.createVideoCapturer(g1Var.I, g1Var.J ? 1 : 0);
                    if (g1Var.F != null) {
                        org.telegram.messenger.p5 p5Var = Utilities.e;
                        NativeInstance nativeInstance = g1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                        g1Var.N.clear();
                        g1Var.F = null;
                    }
                    g1Var.c();
                    g1Var.k();
                    hs.f(g1Var.e).k(hs.G2, Long.valueOf(g1Var.f.id));
                    break;
                }
                break;
            case 15:
                r9 r9Var = (r9) this.b;
                r9Var.l1 = false;
                r9Var.d0();
                break;
            case 16:
                ei.k5 k5Var = (ei.k5) obj;
                ei.s5 s5Var = ((ei.p5) this.b).e;
                while (true) {
                    ArrayList arrayList2 = s5Var.H;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        if (k5Var != arrayList2.get(i10)) {
                            ((ei.k5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    }
                }
            case 17:
                c8 c8Var = (c8) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                c8Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    c8Var.m = true;
                    c8Var.l = str2;
                    c8Var.f = TextUtils.isEmpty(str2);
                    View view = c8Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = c8Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 18:
                fi.q qVar = (fi.q) this.b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.i3(new ei.b0(29, qVar, str5), 120L);
                break;
            case 19:
                ((gi.m) this.b).x(((Integer) obj).intValue());
                break;
            case 20:
                gi.e0 e0Var = (gi.e0) this.b;
                e0Var.k0.n.P = ((Float) obj).floatValue();
                gi.d0 d0Var = e0Var.k0;
                gi.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 21:
                gi.q0 q0Var = (gi.q0) this.b;
                b20 b20Var = (b20) obj;
                zi ziVar = q0Var.c;
                if (ziVar != null) {
                    ziVar.p0 = b20Var;
                    MediaController.B().h0(q0Var.c, false, true, false);
                    break;
                }
                break;
            case 22:
                gi.n2 n2Var = (gi.n2) this.b;
                n2Var.h(-1.0f);
                org.telegram.messenger.g0.i3(new g2.c(10, n2Var, (Runnable) obj), 80L);
                break;
            case 23:
                ((gi.d3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.h1.w).start();
                break;
            case 24:
                gi.y3 y3Var = (gi.y3) this.b;
                View view2 = (View) obj;
                h4 h4Var = y3Var.b;
                if (view2 instanceof gi.x3) {
                    h4Var.getClass();
                    int R = RecyclerView.R(view2);
                    r31 G = h4Var.g3.G(R);
                    if (G != null) {
                        gi.x3 x3Var = (gi.x3) view2;
                        x3Var.setPosition(y3Var.b(R));
                        x3Var.b(y3Var.f == G.d, true);
                        boolean contains = y3Var.e.contains(Integer.valueOf(G.d));
                        if (x3Var.h != contains) {
                            x3Var.h = contains;
                            x3Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 25:
                h4 h4Var2 = (h4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof gi.x3) {
                    o9 o9Var = (o9) h4Var2.o3;
                    o9Var.b.getClass();
                    ((gi.x3) view3).setPosition(o9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 26:
                x9 x9Var = (x9) ((gi.m5) this.b);
                va vaVar = x9Var.k2;
                vaVar.Y0.q((zi) obj);
                f7 f7Var = vaVar.L1;
                if (f7Var != null && vaVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(f7Var.y);
                    boolean z10 = !isEmpty;
                    ((je0) vaVar.k1.c).a(!vaVar.Y0.k(), false);
                    vaVar.k1.setVisibility(0);
                    vaVar.k1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ci.e1(9, x9Var, z10)).start();
                }
                if (vaVar.B0.j()) {
                    ArrayList arrayList4 = vaVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            f7 f7Var2 = ((gi.d0) obj2).n;
                            if (f7Var2 != null && f7Var2.K) {
                                i3 = TextUtils.isEmpty(vaVar.L1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                vaVar.k0(i3, true, true);
                break;
            case 27:
                gi.e7 e7Var = (gi.e7) obj;
                b51 b51Var = ((gi.y5) this.b).n;
                if (b51Var != null) {
                    b51Var.setHDRInfo(e7Var);
                    break;
                }
                break;
            case 28:
                gi.x6 x6Var = (gi.x6) this.b;
                Long l11 = (Long) obj;
                x6Var.x2 = false;
                TLRPC.User a22 = l11 != null ? hp.s1(x6Var.a).a2(l11) : null;
                x6Var.w2 = a22;
                x6Var.y2 = a22 == null;
                if (a22 != null) {
                    x6Var.g1();
                    break;
                }
                break;
            default:
                m7 m7Var = (m7) this.b;
                ug.g0 g0Var = (ug.g0) obj;
                if (g0Var != null) {
                    m7Var.h2 = g0Var.e;
                    m7Var.g2 = g0Var.f;
                    break;
                } else {
                    m7Var.e1();
                    break;
                }
        }
    }
}
