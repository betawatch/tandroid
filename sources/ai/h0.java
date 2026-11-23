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
import bi.b8;
import bi.c9;
import bi.f6;
import bi.h8;
import bi.i4;
import bi.l3;
import di.k4;
import di.y8;
import fi.b5;
import fi.f9;
import fi.g5;
import fi.j5;
import fi.l4;
import fi.s7;
import hi.b7;
import hi.c7;
import hi.d3;
import hi.k5;
import hi.l9;
import hi.sa;
import hi.u9;
import hi.v3;
import hi.v5;
import hi.w3;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.f20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.q5;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.we0;
import org.telegram.ui.Components.y51;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        String str;
        String str2;
        int i7;
        int i10 = 3;
        int i11 = 0;
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) this.b;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence == null) {
                    p0Var.getClass();
                    break;
                } else if (p0Var.r == 3) {
                    String charSequence2 = charSequence.toString();
                    if (!charSequence2.equals(p0Var.z())) {
                        if (p0Var.J == null) {
                            p0Var.J = p0Var.z();
                        }
                        p0Var.D(false);
                        p0Var.v(charSequence2);
                        p0Var.w.setRevert(true);
                        break;
                    }
                }
                break;
            case 1:
                ((l3) this.b).a();
                break;
            case 2:
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.b;
                if (!((Boolean) obj).booleanValue()) {
                    i4.t(2131749595, tL_starGiftUnique);
                    break;
                }
                break;
            case 3:
                ((hi.e) this.b).setLoading(((Boolean) obj).booleanValue());
                break;
            case 4:
                h8 h8Var = (h8) this.b;
                ((Boolean) obj).getClass();
                b8 b8Var = h8Var.d;
                if (b8Var != null) {
                    b8Var.run();
                    break;
                }
                break;
            case 5:
                wg.h.j(((c9) this.b).getContext(), (TLRPC.TL_error) obj);
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.b;
                Long l10 = (Long) obj;
                if (!g2Var.isFinished) {
                    if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                        g2Var.presentFragment(ProfileActivity.D4(l10.longValue()), true);
                        break;
                    } else {
                        org.telegram.messenger.g0.g3(new n(7));
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
                        Utilities.e.c(new i0(str3, new ci.q0(z0Var, str3, 0)));
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
                y8.a((y8) this.b, (TL_stars.StarGifts) obj);
                break;
            case 13:
                ((org.telegram.ui.ActionBar.w2) this.b).a(((Boolean) obj).booleanValue());
                break;
            case 14:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i12 = starGift.availability_remains;
                        textView.setText(i12 <= 0 ? hd.H(',', "Gift2Availability2ValueNone", starGift.availability_total) : hd.K("Gift2Availability4Value", i12, ',', hd.E(starGift.availability_total, ',')));
                        break;
                    } else {
                        if (starGift.availability_remains <= 0) {
                            str = hd.H(',', "Gift2QuantityIssuedNone", starGift.availability_total);
                        } else {
                            str = hd.H(',', "Gift2QuantityIssued1", starGift.availability_issued) + hd.H(',', "Gift2QuantityIssued2", starGift.availability_total);
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
                    ls.f(c1Var.e).k(ls.G2, Long.valueOf(c1Var.f.id));
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
                b5 b5Var = (b5) obj;
                j5 j5Var = ((g5) this.b).e;
                while (true) {
                    ArrayList arrayList2 = j5Var.H;
                    if (i11 >= arrayList2.size()) {
                        break;
                    } else {
                        if (b5Var != arrayList2.get(i11)) {
                            ((b5) arrayList2.get(i11)).getClass();
                        }
                        i11++;
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
                org.telegram.messenger.g0.h3(new l4(21, qVar, str5), 120L);
                break;
            case 21:
                ((hi.o) this.b).x(((Integer) obj).intValue());
                break;
            case 22:
                hi.g0 g0Var = (hi.g0) this.b;
                g0Var.k0.n.P = ((Float) obj).floatValue();
                hi.f0 f0Var = g0Var.k0;
                hi.e0 e0Var = f0Var.d;
                if (e0Var != null) {
                    e0Var.setVolume(f0Var.n.P);
                    break;
                }
                break;
            case 23:
                hi.s0 s0Var = (hi.s0) this.b;
                f20 f20Var = (f20) obj;
                gj gjVar = s0Var.c;
                if (gjVar != null) {
                    gjVar.r0 = f20Var;
                    MediaController.B().h0(s0Var.c, false, true, false);
                    break;
                }
                break;
            case 24:
                hi.n2 n2Var = (hi.n2) this.b;
                n2Var.h(-1.0f);
                org.telegram.messenger.g0.h3(new hi.c(i10, n2Var, (Runnable) obj), 80L);
                break;
            case 25:
                ((d3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + org.telegram.messenger.g0.L(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.i1.w).start();
                break;
            case 26:
                w3 w3Var = (w3) this.b;
                View view2 = (View) obj;
                f6 f6Var = w3Var.b;
                if (view2 instanceof v3) {
                    f6Var.getClass();
                    int R = RecyclerView.R(view2);
                    o41 G = f6Var.g3.G(R);
                    if (G != null) {
                        v3 v3Var = (v3) view2;
                        v3Var.setPosition(w3Var.b(R));
                        v3Var.b(w3Var.f == G.d, true);
                        boolean contains = w3Var.e.contains(Integer.valueOf(G.d));
                        if (v3Var.h != contains) {
                            v3Var.h = contains;
                            v3Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 27:
                f6 f6Var2 = (f6) this.b;
                View view3 = (View) obj;
                if (view3 instanceof v3) {
                    l9 l9Var = (l9) f6Var2.o3;
                    l9Var.b.getClass();
                    ((v3) view3).setPosition(l9Var.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 28:
                u9 u9Var = (u9) ((k5) this.b);
                sa saVar = u9Var.k2;
                saVar.Y0.q((gj) obj);
                c7 c7Var = saVar.L1;
                if (c7Var != null && saVar.P1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(c7Var.y);
                    boolean z10 = !isEmpty;
                    ((we0) saVar.k1.c).a(!saVar.Y0.k(), false);
                    saVar.k1.setVisibility(0);
                    saVar.k1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ch.k(9, u9Var, z10)).start();
                }
                if (saVar.B0.j()) {
                    ArrayList arrayList4 = saVar.B0.h;
                    int size = arrayList4.size();
                    while (true) {
                        if (i11 < size) {
                            Object obj2 = arrayList4.get(i11);
                            i11++;
                            c7 c7Var2 = ((hi.f0) obj2).n;
                            if (c7Var2 != null && c7Var2.K) {
                                i7 = TextUtils.isEmpty(saVar.L1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                saVar.k0(i7, true, true);
                break;
            default:
                b7 b7Var = (b7) obj;
                y51 y51Var = ((v5) this.b).n;
                if (y51Var != null) {
                    y51Var.setHDRInfo(b7Var);
                    break;
                }
                break;
        }
    }
}
