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
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.z71;
import org.telegram.ui.ey;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final /* synthetic */ class r0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        String str;
        String str2;
        int i10;
        b71 b71Var;
        int i11 = 3;
        int i12 = 0;
        int i13 = 0;
        switch (this.a) {
            case 0:
                b1 b1Var = (b1) this.b;
                int i14 = b1.x0[((Integer) obj).intValue()];
                if (b1Var.o0 != i14) {
                    b1Var.o0 = i14;
                    b1Var.g0.setText(LocaleController.formatPluralString("GiftOfferHours", i14 / 3600, new Object[0]));
                }
                b1Var.T(true);
                break;
            case 1:
                a2 a2Var = (a2) this.b;
                a2Var.i0.g();
                a2Var.k0.N(true);
                break;
            case 2:
                l5 l5Var = (l5) this.b;
                l5Var.getClass();
                l5Var.s = new Matrix();
                l5Var.v = new Matrix();
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader((Bitmap) obj, tileMode, tileMode);
                l5Var.r = bitmapShader;
                Paint paint = l5Var.c;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.25f);
                paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 3:
                ha.a((ha) this.b, (TL_stars.StarGifts) obj);
                break;
            case 4:
                ((org.telegram.ui.ActionBar.h3) this.b).dismiss(((Boolean) obj).booleanValue());
                break;
            case 5:
                TextView textView = (TextView) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                if (starGift != null) {
                    if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
                        int i15 = starGift.availability_remains;
                        textView.setText(i15 <= 0 ? LocaleController.formatPluralStringComma("Gift2Availability2ValueNone", starGift.availability_total) : LocaleController.formatPluralStringComma("Gift2Availability4Value", i15, LocaleController.formatNumber(starGift.availability_total, ',')));
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
            case 6:
                ci.h1 h1Var = (ci.h1) this.b;
                if (((Boolean) obj).booleanValue() && !h1Var.w) {
                    h1Var.n = true;
                    h1Var.I = true;
                    h1Var.u(false);
                    ci.h1.W = h1Var;
                    h1Var.J = NativeInstance.createVideoCapturer(h1Var.H, h1Var.I ? 1 : 0);
                    if (h1Var.E != null) {
                        DispatchQueue dispatchQueue = Utilities.globalQueue;
                        NativeInstance nativeInstance = h1Var.E;
                        Objects.requireNonNull(nativeInstance);
                        dispatchQueue.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                        h1Var.M.clear();
                        h1Var.E = null;
                    }
                    h1Var.c();
                    h1Var.k();
                    NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.f.id));
                    break;
                }
                break;
            case 7:
                ci.z9 z9Var = (ci.z9) this.b;
                z9Var.k1 = false;
                z9Var.P();
                break;
            case 8:
                ci.t5 t5Var = (ci.t5) obj;
                ci.b6 b6Var = ((ci.y5) this.b).e;
                while (true) {
                    ArrayList arrayList = b6Var.G;
                    if (i12 >= arrayList.size()) {
                        break;
                    } else {
                        if (t5Var != arrayList.get(i12)) {
                            ((ci.t5) arrayList.get(i12)).getClass();
                        }
                        i12++;
                    }
                }
            case 9:
                ci.m8 m8Var = (ci.m8) this.b;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                m8Var.p = true;
                if (storyItem != null && (str2 = storyItem.caption) != null) {
                    m8Var.m = true;
                    m8Var.l = str2;
                    m8Var.f = TextUtils.isEmpty(str2);
                    View view = m8Var.r;
                    if (view != null) {
                        view.invalidate();
                    }
                    Runnable runnable = m8Var.s;
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 10:
                di.v vVar = (di.v) this.b;
                String str3 = (String) obj;
                ArrayList arrayList2 = vVar.h;
                if (!arrayList2.contains(str3)) {
                    arrayList2.add(str3);
                    vVar.i(true);
                }
                AndroidUtilities.runOnUIThread(new ci.u7(12, vVar, str3), 120L);
                break;
            case 11:
                ((ei.m) this.b).x(((Integer) obj).intValue());
                break;
            case 12:
                ei.e0 e0Var = (ei.e0) this.b;
                e0Var.j0.n.P = ((Float) obj).floatValue();
                ei.d0 d0Var = e0Var.j0;
                ei.c0 c0Var = d0Var.d;
                if (c0Var != null) {
                    c0Var.setVolume(d0Var.n.P);
                    break;
                }
                break;
            case 13:
                ei.r0 r0Var = (ei.r0) this.b;
                VideoEditedInfo videoEditedInfo = (VideoEditedInfo) obj;
                MessageObject messageObject = r0Var.c;
                if (messageObject != null) {
                    messageObject.videoEditedInfo = videoEditedInfo;
                    MediaController.getInstance().scheduleVideoConvert(r0Var.c);
                    break;
                }
                break;
            case 14:
                ei.s2 s2Var = (ei.s2) this.b;
                s2Var.h(-1.0f);
                AndroidUtilities.runOnUIThread(new ci.u7(25, s2Var, (Runnable) obj), 80L);
                break;
            case 15:
                ((ei.q3) this.b).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(org.telegram.ui.ActionBar.o1.w).start();
                break;
            case 16:
                ei.l4 l4Var = (ei.l4) this.b;
                View view2 = (View) obj;
                ei.g4 g4Var = l4Var.b;
                if (view2 instanceof ei.k4) {
                    g4Var.getClass();
                    int R = RecyclerView.R(view2);
                    m61 G = g4Var.Z2.G(R);
                    if (G != null) {
                        ei.k4 k4Var = (ei.k4) view2;
                        k4Var.setPosition(l4Var.b(R));
                        k4Var.b(l4Var.f == G.d, true);
                        boolean contains = l4Var.e.contains(Integer.valueOf(G.d));
                        if (k4Var.h != contains) {
                            k4Var.h = contains;
                            k4Var.invalidate();
                        }
                        view2.setPressed(false);
                        break;
                    }
                }
                break;
            case 17:
                ei.g4 g4Var2 = (ei.g4) this.b;
                View view3 = (View) obj;
                if (view3 instanceof ei.k4) {
                    ei.ma maVar = g4Var2.g3;
                    maVar.b.getClass();
                    ((ei.k4) view3).setPosition(maVar.b(RecyclerView.R(view3)));
                    view3.setPressed(false);
                    break;
                }
                break;
            case 18:
                ei.xa xaVar = (ei.xa) ((ei.f6) this.b);
                ei.vb vbVar = xaVar.A2;
                vbVar.X0.q((MessageObject) obj);
                ei.a8 a8Var = vbVar.K1;
                if (a8Var != null && vbVar.O1 != 1) {
                    boolean isEmpty = TextUtils.isEmpty(a8Var.y);
                    boolean z10 = !isEmpty;
                    ((eh0) vbVar.j1.c).a(!vbVar.X0.k(), false);
                    vbVar.j1.setVisibility(0);
                    vbVar.j1.animate().alpha(!isEmpty ? 1.0f : 0.0f).withEndAction(new ah.t(9, xaVar, z10)).start();
                }
                if (vbVar.A0.j()) {
                    ArrayList arrayList3 = vbVar.A0.h;
                    int size = arrayList3.size();
                    while (true) {
                        if (i13 < size) {
                            Object obj2 = arrayList3.get(i13);
                            i13++;
                            ei.a8 a8Var2 = ((ei.d0) obj2).n;
                            if (a8Var2 != null && a8Var2.K) {
                                i10 = TextUtils.isEmpty(vbVar.K1.y) ? -1 : 2;
                            }
                        }
                    }
                }
                vbVar.k0(i10, true, true);
                break;
            case 19:
                ei.z7 z7Var = (ei.z7) obj;
                z71 z71Var = ((ei.r6) this.b).n;
                if (z71Var != null) {
                    z71Var.setHDRInfo(z7Var);
                    break;
                }
                break;
            case 20:
                ei.s7.S((ei.s7) this.b, (Long) obj);
                break;
            case 21:
                ei.j8 j8Var = (ei.j8) this.b;
                rg.n0 n0Var = (rg.n0) obj;
                if (n0Var != null) {
                    j8Var.o0 = n0Var.e;
                    j8Var.n0 = n0Var.f;
                    break;
                } else {
                    j8Var.U();
                    break;
                }
            case 22:
                ((ei.g9) this.b).n.W.H = ((Integer) obj).intValue();
                break;
            case 23:
                ((ei.qa) this.b).h((Utilities.Callback) obj);
                break;
            case 24:
                gi.t tVar = (gi.t) this.b;
                ArrayList arrayList4 = tVar.b;
                arrayList4.clear();
                arrayList4.addAll((ArrayList) obj);
                j71 j71Var = tVar.a;
                if (j71Var != null && (b71Var = j71Var.Z2) != null) {
                    b71Var.N(true);
                    break;
                }
                break;
            case 25:
                ((hg.m) this.b).M((TLRPC.User) obj);
                break;
            case 26:
                TLRPC.User user = (TLRPC.User) obj;
                so0 so0Var = (so0) ((hg.h0) this.b);
                nx nxVar = so0Var.K0;
                if (user != null) {
                    ey eyVar = nxVar.J0;
                    if (eyVar != null) {
                        eyVar.I3();
                    }
                    MessagesController.getInstance(nxVar.H0).openApp(user, 0);
                    so0Var.Q(user.id, user);
                    break;
                }
                break;
            case 27:
                hi.f fVar = (hi.f) this.b;
                ArrayList arrayList5 = (ArrayList) obj;
                ArrayList arrayList6 = fVar.n;
                boolean z11 = arrayList6 == null || arrayList6.isEmpty();
                fVar.n = arrayList5;
                j71 j71Var2 = fVar.f;
                if (j71Var2 != null) {
                    j71Var2.Z2.N(z11);
                    break;
                }
                break;
            case 28:
                ig.m mVar = (ig.m) this.b;
                boolean z12 = ((Integer) obj).intValue() > AndroidUtilities.dp(20.0f);
                if (mVar.I != z12) {
                    mVar.I = z12;
                    if (!z12) {
                        mVar.a.x0(0);
                        break;
                    }
                }
                break;
            default:
                AndroidUtilities.forEachViews((RecyclerView) ((ig.h0) this.b).s, (Utilities.Callback<View>) new ci.e(i11));
                break;
        }
    }
}
