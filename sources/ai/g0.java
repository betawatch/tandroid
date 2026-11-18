package ai;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bi.c6;
import bi.e4;
import bi.e8;
import bi.h3;
import bi.y7;
import bi.z8;
import di.k4;
import di.x8;
import fi.a5;
import fi.a6;
import fi.f5;
import fi.f9;
import fi.i5;
import fi.s7;
import hi.c7;
import hi.d7;
import hi.e3;
import hi.l5;
import hi.m9;
import hi.ta;
import hi.v9;
import hi.w3;
import hi.w5;
import hi.x3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        String str;
        String str2;
        int i7;
        int i10 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                n0 n0Var = (n0) this.b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence == null) {
                    n0Var.getClass();
                    break;
                } else if (n0Var.r == 3) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.equals(n0Var.y())) {
                        if (n0Var.J == null) {
                            n0Var.J = n0Var.y();
                        }
                        n0Var.B(false);
                        n0Var.u(charSequence2);
                        n0Var.w.setRevert(true);
                        break;
                    }
                }
                break;
            case 1:
                ((h3) this.b).a();
                break;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                if (!((Boolean) obj).booleanValue()) {
                    e4.t(2131749596, tL_starGiftUnique);
                    break;
                }
                break;
            case 3:
                ((hi.d) this.b).setLoading(((Boolean) obj).booleanValue());
                break;
            case 4:
                e8 e8Var = (e8) this.b;
                ((Boolean) obj).getClass();
                y7 y7Var = e8Var.d;
                if (y7Var != null) {
                    y7Var.run();
                    break;
                }
                break;
            case 5:
                wg.h.j(((z8) this.b).getContext(), (TLRPC.TL_error) obj);
                break;
            case 6:
                ci.s sVar = (ci.s) this.b;
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
            case 7:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.b;
                Long l10 = (Long) obj;
                if (!h2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        h2Var.presentFragment(ProfileActivity.D4(l10.longValue()), true);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(new o(7));
                        break;
                    }
                }
                break;
            case 8:
                ci.o0 o0Var = (ci.o0) this.b;
                TLRPC.TL_exportedContactToken tL_exportedContactToken = (TLRPC.TL_exportedContactToken) obj;
                ci.z0 z0Var = o0Var.b;
                if (!o0Var.F && tL_exportedContactToken != null) {
                    o0Var.r = tL_exportedContactToken;
                    o0Var.s = 0L;
                    String str3 = tL_exportedContactToken.url;
                    String str4 = o0Var.c.b;
                    if (!TextUtils.equals(z0Var.f, str4) || z0Var.h) {
                        z0Var.f = str4;
                        z0Var.h = false;
                        z0Var.I5 = null;
                        z0Var.J5 = 0;
                    }
                    if (!TextUtils.equals(z0Var.d, str3)) {
                        z0Var.d = str3;
                        Utilities.e.c(new h0(str3, new ci.q0(z0Var, str3, 0)));
                    }
                    z0Var.setLinkExpires(tL_exportedContactToken.expires);
                    break;
                }
                break;
            case 9:
                ci.z0 z0Var2 = (ci.z0) this.b;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet2 != null) {
                    z0Var2.getClass();
                    ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet2.documents;
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z0Var2.q8 = tL_messages_stickerSet2.documents.get(0);
                    }
                }
                z0Var2.invalidate();
                break;
            case 10:
                di.h1 h1Var = (di.h1) this.b;
                h1Var.e2.g();
                h1Var.g2.O(true);
                break;
            case 11:
                k4 k4Var = (k4) this.b;
                k4Var.getClass();
                k4Var.s = new Matrix();
                k4Var.w = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                k4Var.r = bitmapShader;
                Paint paint = k4Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                org.telegram.messenger.g0.i(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 12:
                x8.a((x8) this.b, (TL_stars.StarGifts) obj);
                break;
            case 13:
                ((org.telegram.ui.ActionBar.x2) this.b).a(((Boolean) obj).booleanValue());
                break;
            case 14:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i12 = starGift.availability_remains;
                        textView.setText(i12 <= 0 ? gd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : gd.K("Gift2Availability4Value", i12, ',', gd.E(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = gd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = gd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + gd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
                        }
                        textView.setText(str);
                        break;
                    }
                }
                break;
            case 15:
                fi.c1 c1Var = (fi.c1) this.b;
                if (((Boolean) obj).booleanValue() && !c1Var.x) {
                    c1Var.n = true;
                    c1Var.J = true;
                    c1Var.u(false);
                    fi.c1.X = c1Var;
                    c1Var.K = NativeInstance.createVideoCapturer(c1Var.I, c1Var.J ? 1 : 0);
                    if (c1Var.F != null) {
                        q5 q5Var = Utilities.e;
                        NativeInstance nativeInstance = c1Var.F;
                        Objects.requireNonNull(nativeInstance);
                        q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        c1Var.N.clear();
                        c1Var.F = null;
                    }
                    c1Var.c();
                    c1Var.k();
                    ks.f(c1Var.e).k(ks.G2, Long.valueOf(c1Var.f.id));
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.voip.t0 t0Var = (org.telegram.ui.Components.voip.t0) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (t0Var != null) {
                    t0Var.a();
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 17:
                f9 f9Var = (f9) this.b;
                f9Var.k1 = false;
                f9Var.V();
                break;
            case 18:
                a5 a5Var = (a5) obj;
                i5 i5Var = ((f5) this.b).e;
                while (true) {
                    ArrayList arrayList2 = i5Var.H;
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else {
                        if (a5Var != arrayList2.get(i10)) {
                            ((a5) arrayList2.get(i10)).getClass();
                        }
                        i10++;
                    }
                }
            case 19:
                s7 s7Var = (s7) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                s7Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    s7Var.m = true;
                    s7Var.l = str2;
                    s7Var.f = TextUtils.isEmpty(str2);
                    View view = s7Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = s7Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 20:
                gi.q qVar = (gi.q) this.b;
                String str5 = (String) obj;
                ArrayList arrayList3 = qVar.h;
                if (!arrayList3.contains(str5)) {
                    arrayList3.add(str5);
                    qVar.i(true);
                }
                org.telegram.messenger.g0.h3(new a6(19, qVar, str5), 120L);
                break;
            case 21:
                ((hi.n) this.b).x(((Integer) obj).intValue());
                break;
            case 22:
                hi.f0 f0Var = (hi.f0) this.b;
                f0Var.k0.n.P = ((Float) obj).floatValue();
                hi.e0 e0Var = f0Var.k0;
                hi.d0 d0Var = e0Var.d;
                if (d0Var != null) {
                    d0Var.setVolume(e0Var.n.P);
                    break;
                }
                break;
            case 23:
                hi.s0 s0Var = (hi.s0) this.b;
                e20 e20Var = (e20) obj;
                fj fjVar = s0Var.c;
                if (fjVar != null) {
                    fjVar.r0 = e20Var;
                    MediaController.B().h0(s0Var.c, false, true, false);
                    break;
                }
                break;
            case 24:
                hi.o2 o2Var = (hi.o2) this.b;
                o2Var.h(-1.0f);
                org.telegram.messenger.g0.h3(new hi.r1(i11, o2Var, (Runnable) obj), 80L);
                break;
            case 25:
                ((e3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.j1.w).start();
                break;
            case 26:
                x3 x3Var = (x3) this.b;
                View view2 = (View) obj;
                c6 c6Var = x3Var.b;
                if (view2 instanceof w3) {
                    c6Var.getClass();
                    int R = RecyclerView.R(view2);
                    l41 G = c6Var.g3.G(R);
                    if (G != null) {
                        w3 w3Var = (w3) view2;
                        w3Var.setPosition(x3Var.b(R));
                        w3Var.b(x3Var.f == G.d, true);
                        boolean contains = x3Var.e.contains(Integer.valueOf(G.d));
                        if (w3Var.h != contains) {
                            w3Var.h = contains;
                            w3Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 27:
                c6 c6Var2 = (c6) this.b;
                View view3 = (View) obj;
                if (view3 instanceof w3) {
                    m9 m9Var = (m9) c6Var2.o3;
                    m9Var.b.getClass();
                    ((w3) view3).setPosition(m9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 28:
                v9 v9Var = (v9) ((l5) this.b);
                ta taVar = v9Var.k2;
                taVar.Y0.q((fj) obj);
                d7 d7Var = taVar.L1;
                if (d7Var != null && taVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(d7Var.y);
                    boolean z10 = !isEmpty;
                    ((ue0) taVar.k1.c).a(!taVar.Y0.k(), false);
                    taVar.k1.setVisibility(0);
                    taVar.k1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ch.k(9, v9Var, z10)).start();
                }
                if (taVar.B0.j()) {
                    ArrayList arrayList4 = taVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i10 < size) {
                            Object obj2 = arrayList4.get(i10);
                            i10++;
                            d7 d7Var2 = ((hi.e0) obj2).n;
                            if (d7Var2 != null && d7Var2.K) {
                                i7 = TextUtils.isEmpty(taVar.L1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                taVar.k0(i7, true, true);
                break;
            default:
                c7 c7Var = (c7) obj;
                v51 v51Var = ((w5) this.b).n;
                if (v51Var != null) {
                    v51Var.setHDRInfo(c7Var);
                    break;
                }
                break;
        }
    }
}
