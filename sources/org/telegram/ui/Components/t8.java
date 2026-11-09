package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t8 extends org.telegram.ui.ActionBar.f2 {
    public static final int[][] c0 = {new int[]{-11302949, -11562789, -10430789, -11480359}, new int[]{-11229725, -12014137, -10234219, -10819908}, new int[]{-12927610, -11158198, -3355566, -5191850}, new int[]{-8164117, -5281560, -2200166, -2525971}, new int[]{-1287263, -1350281, -1337532, -885148}, new int[]{-1419145, -1936819, -742839, -1014448}, new int[]{-1017772, -1212871, -998847, -1003446}};
    public static final int[][] d0 = {new int[]{-7035984, -9667705}, new int[]{-1334949, -6199504}, new int[]{-1525432, -4686800}, new int[]{-11117215, -12893369}, new int[]{-15000805, -16777216}, new int[]{-10588271, -12496267}, new int[]{-5344541, -7842635}, new int[]{-5278276, -7777898}, new int[]{-4036162, -7650428}, new int[]{-2459992, -5351279}, new int[]{-1678221, -5814951}, new int[]{-9659148, -10720532}, new int[]{-12149549, -13731672}, new int[]{-12350279, -13802877}, new int[]{-10046854, -13404051}, new int[]{-8276302, -11822442}, new int[]{-10760507, -13200754}, new int[]{-10496401, -13525130}, new int[]{-1668548, -2862189}, new int[]{-9706766, -10062345}, new int[]{-3838476, -10456076}, new int[]{-1324753, -11225016}, new int[]{-10046854, -13404051}, new int[]{-3492512, -7569348}, new int[]{-5394320, -9732780}, new int[]{-7039865, -9408414}, new int[]{-5202023, -7373198}, new int[]{-3701922, -6397115}, new int[]{-4427695, -6859449}, new int[]{-7379371, -9944001}};
    public FrameLayout D;
    public float E;
    public boolean F;
    public ValueAnimator G;
    public org.telegram.ui.ActionBar.k H;
    public f2 I;
    public q8 J;
    public pc K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public final Paint O;
    public int P;
    public boolean Q;
    public org.telegram.ui.ActionBar.r0 R;
    public org.telegram.messenger.c9 S;
    public final i30 T;
    public boolean U;
    public TextView V;
    public TextView W;
    public final k30 X;
    public p8 Y;
    public boolean Z;
    public m8 a;
    public float a0;
    public n8 b;
    public ValueAnimator b0;
    public int c;
    public int d;
    public View e;
    public boolean f;
    public boolean h;
    public boolean n;
    public org.telegram.ui.d61 r;
    public CharSequence s;
    public SpannableStringBuilder w;
    public boolean x;
    public fi.d y;

    public t8(k30 k30Var, i30 i30Var) {
        super(null);
        this.O = new Paint();
        this.Q = true;
        this.Z = false;
        this.a0 = 0.0f;
        this.X = k30Var;
        this.T = i30Var;
    }

    public static void Z(t8 t8Var) {
        if (t8Var.getParentActivity() == null) {
            return;
        }
        if (!t8Var.n) {
            t8Var.finishFragment();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(t8Var.getParentActivity());
        String M0 = org.telegram.messenger.id.M0(2131747278, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.T = M0;
        u1Var.R = org.telegram.messenger.id.M0(2131751405, null);
        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747580, null), new h8(t8Var, 1));
        alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
        t8Var.showDialog(u1Var);
        u1Var.i();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        this.hasOwnBackground = true;
        this.actionBar.setBackgroundDrawable(null);
        int i7 = 0;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.l(kVar, 5, i10, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 1, i10, null);
        org.telegram.ui.ActionBar.s6.l(this.actionBar, 3, org.telegram.ui.ActionBar.l6.i6, null);
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(org.telegram.messenger.id.M0(2131747280, null));
        this.actionBar.setActionBarMenuOnItemClick(new k8(this, 0));
        this.actionBar.getTitleTextView().setAlpha(0.0f);
        org.telegram.ui.ActionBar.k kVar2 = new org.telegram.ui.ActionBar.k(getParentActivity(), null);
        this.H = kVar2;
        kVar2.setCastShadows(false);
        this.H.setAddToContainer(false);
        this.H.setOccupyStatusBar(true);
        this.H.setClipChildren(false);
        int o4 = i0.a.o(-1, 60);
        this.H.E(-1, false);
        this.H.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.H.setAllowOverlayTitle(false);
        this.H.D(o4, false);
        org.telegram.ui.ActionBar.y r10 = this.H.r();
        r10.setClipChildren(false);
        int i11 = 2;
        i30 i30Var = this.T;
        org.telegram.ui.ActionBar.r0 e10 = r10.e(1, (i30Var == null || i30Var.c != 2) ? org.telegram.messenger.id.M0(2131745519, null) : org.telegram.messenger.id.M0(2131744408, null));
        this.R = e10;
        e10.setBackground(org.telegram.ui.ActionBar.l6.h0(o4, 3, -1));
        this.H.setActionBarMenuOnItemClick(new k8(this, 1));
        this.r = new org.telegram.ui.d61(10, getParentActivity(), this);
        l8 l8Var = new l8(this, context);
        l8Var.setFitsSystemWindows(true);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.a7, l8Var, null);
        this.r.setClipChildren(false);
        this.r.setClipToPadding(false);
        this.r.setPadding(0, org.telegram.messenger.g0.m, 0, 0);
        this.r.setOrientation(1);
        org.telegram.ui.d61 d61Var = this.r;
        m8 m8Var = new m8(this, getParentActivity(), l8Var);
        this.a = m8Var;
        d61Var.addView(m8Var);
        TextView textView = new TextView(getParentActivity());
        this.W = textView;
        textView.setText(org.telegram.messenger.id.M0(2131752139, null));
        TextView textView2 = this.W;
        int i12 = org.telegram.ui.ActionBar.l6.y6;
        org.telegram.ui.ActionBar.s6.U(textView2, i12, null);
        this.W.setTextSize(1, 14.0f);
        this.W.setGravity(17);
        this.r.addView(this.W, c8.ha.t(-1, -2, 0, 21, 10, 21, 10));
        bi.s1 s1Var = new bi.s1(this, getParentActivity());
        q8 q8Var = new q8(this, getParentActivity());
        this.J = q8Var;
        s1Var.addView(q8Var);
        this.r.addView(s1Var, c8.ha.t(-1, 48, 0, 12, 0, 12, 0));
        TextView textView3 = new TextView(getParentActivity());
        this.V = textView3;
        textView3.setText(org.telegram.messenger.id.M0(2131752131, null));
        org.telegram.ui.ActionBar.s6.U(this.V, i12, null);
        this.V.setTextSize(1, 14.0f);
        this.V.setGravity(17);
        this.r.addView(this.V, c8.ha.t(-1, -2, 0, 21, 18, 21, 10));
        n8 n8Var = new n8(this, this, getParentActivity(), getThemedColor(i10));
        this.b = n8Var;
        n8Var.R = true;
        n8Var.setAnimationsEnabled(this.fragmentBeginToShow);
        this.b.setClipChildren(false);
        this.r.addView(this.b, c8.ha.t(-1, -1, 0, 12, 0, 12, 12));
        this.r.setClipChildren(false);
        l8Var.addView(this.r, c8.ha.d(-1, -1.0f, 0, 0.0f, 0.0f, 0.0f, 64.0f));
        View view = new View(getParentActivity());
        this.e = view;
        view.setVisibility(8);
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.y = dVar;
        dVar.f();
        this.y.d.r(false, false);
        int i13 = this.X.V;
        if (i13 == 1) {
            this.s = org.telegram.messenger.id.M0(2131745539, null);
        } else if (i13 == 3) {
            this.s = org.telegram.messenger.id.M0(2131745536, null);
        } else if (i13 == 2) {
            this.s = org.telegram.messenger.id.M0(2131745525, null);
        } else if (i30Var == null || i30Var.c != 2) {
            this.s = org.telegram.messenger.id.M0(2131745523, null);
        } else {
            this.s = org.telegram.messenger.id.M0(2131744408, null);
        }
        this.s = new SpannableStringBuilder(this.s);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.s);
        spannableStringBuilder.append((CharSequence) " l");
        spannableStringBuilder.setSpan(new wp(R.drawable.msg_mini_lock2, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.w = spannableStringBuilder;
        this.x = false;
        this.y.i(this.s, false, true);
        this.y.setOnClickListener(new h0(this, i11));
        this.D = new FrameLayout(context);
        l8Var.addView(this.y, c8.ha.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f));
        l8Var.addView(this.D, c8.ha.d(-1, 80.0f, 80, 8.0f, 16.0f, 8.0f, 64.0f));
        l8Var.addView(this.actionBar);
        l8Var.addView(this.H);
        l8Var.addView(this.e, c8.ha.c(-1.0f, -1));
        pc pcVar = new pc(l8Var);
        this.K = pcVar;
        pcVar.h = new g8(this, i7);
        this.fragmentView = l8Var;
        return l8Var;
    }

    public final void i0() {
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.G.cancel();
            this.G = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (org.telegram.messenger.g0.B(r5) > 0.721f) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0040, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004f, code lost:
    
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.a7, false)) > 0.721f) goto L21;
     */
    @Override // org.telegram.ui.ActionBar.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isLightStatusBar() {
        boolean z9;
        m8 m8Var = this.a;
        if (m8Var != null && (m8Var.w || (m8Var.x >= 0.0f && m8Var.h != null))) {
            p8 p8Var = m8Var.h;
            int i7 = p8Var.c;
            int i10 = p8Var.d;
            if (i10 != 0) {
                i7 = i0.a.f(0.5f, i7, i10);
            }
            int i11 = p8Var.e;
            if (i11 != 0) {
                i7 = i0.a.f(0.5f, i7, i11);
            }
            int i12 = p8Var.f;
            if (i12 != 0) {
                i7 = i0.a.f(0.5f, i7, i12);
            }
        }
        if (this.Z != z9) {
            this.Z = z9;
            if (this.actionBar.getAlpha() == 0.0f) {
                o0(z9 ? 0.0f : 1.0f);
            } else {
                ValueAnimator valueAnimator = this.b0;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    this.b0.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.a0, z9 ? 0.0f : 1.0f);
                this.b0 = ofFloat;
                ofFloat.addUpdateListener(new e6(this, 3));
                this.b0.setDuration(150L).start();
            }
        }
        org.telegram.messenger.c9 c9Var = this.S;
        if (c9Var != null) {
            org.telegram.messenger.g0.q3(c9Var, z9);
        }
        return z9;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final boolean j0() {
        if (org.telegram.messenger.p10.i(this.currentAccount).q()) {
            return false;
        }
        m8 m8Var = this.a;
        p8 p8Var = m8Var.h;
        return (p8Var != null && p8Var.b) || m8Var.n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:12|(1:14)(1:93)|15|(3:16|17|18)|(2:19|20)|21|(1:23)(3:83|(1:85)|86)|24|25|26|27|(5:38|(7:40|(1:42)|43|(1:45)|46|(1:48)|49)(2:68|(7:70|(1:72)|73|(1:75)|76|(1:78)|79))|50|(1:52)(1:67)|(5:54|(3:62|(1:64)(1:66)|65)|58|(1:60)|61))(1:31)|32|(3:34|(1:36)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        boolean z9;
        int i7;
        byte b10;
        ImageReceiver imageReceiver;
        TLRPC.Document document;
        float f10;
        File file;
        org.telegram.messenger.gf gfVar;
        TLRPC.Document e10;
        ByteArrayOutputStream byteArrayOutputStream;
        if (this.a.getImageReceiver() == null || !this.a.getImageReceiver().J()) {
            return;
        }
        int i10 = 1;
        if (j0()) {
            new hc(this.D, this.resourceProvider).Q(R.raw.star_premium_2, 36, org.telegram.messenger.g0.x2(org.telegram.messenger.id.M0(2131747065, null), new g8(this, i10))).j();
            return;
        }
        f2 f2Var = this.I;
        if (f2Var != null) {
            m8 m8Var = this.a;
            p8 p8Var = m8Var.h;
            long j3 = m8Var.a;
            TLRPC.Document document2 = m8Var.b;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) f2Var.b;
            t8 t8Var = (t8) f2Var.c;
            boolean z10 = ChatAttachAlertPhotoLayout.q1;
            di diVar = chatAttachAlertPhotoLayout.b;
            HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
            hashMap.clear();
            Bitmap createBitmap = Bitmap.createBitmap(800, 800, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            f10 f10Var = new f10();
            if (p8Var != null) {
                z9 = true;
                i7 = 0;
                f10Var.d(p8Var.c, p8Var.d, p8Var.e, p8Var.f);
            } else {
                z9 = true;
                i7 = 0;
                int[] iArr = c0[0];
                f10Var.d(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            f10Var.b(0.0f, 0.0f, 800.0f, 800.0f);
            canvas.drawRect(0.0f, 0.0f, 800.0f, 800.0f, f10Var.c);
            File file2 = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.iz.p() + "avatar_background.png");
            try {
                file2.createNewFile();
                byteArrayOutputStream = new ByteArrayOutputStream();
                b10 = 4;
            } catch (IOException e11) {
                e = e11;
                b10 = 4;
            }
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, i7, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e12) {
                e = e12;
                e.printStackTrace();
                int i11 = (int) 120.00001f;
                int i12 = (int) 560.0f;
                imageReceiver = m8Var.getImageReceiver();
                if (imageReceiver.m() == null) {
                }
                file = new File(org.telegram.messenger.w7.z(b10), org.telegram.messenger.iz.p() + "avatar_background.png");
                file.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream2);
                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                fileOutputStream2.write(byteArray2);
                fileOutputStream2.flush();
                fileOutputStream2.close();
                if (m8Var.getImageReceiver().m() == null) {
                }
                gfVar = new org.telegram.messenger.gf(0, file2.getPath(), 0, false, 0, 0);
                gfVar.c = file.getPath();
                if (m8Var.a == 0) {
                }
                org.telegram.messenger.j20 j20Var = new org.telegram.messenger.j20();
                gfVar.s = j20Var;
                j20Var.o = file2.getPath();
                org.telegram.messenger.j20 j20Var2 = gfVar.s;
                j20Var2.k = 800;
                j20Var2.l = 800;
                j20Var2.h = 800;
                j20Var2.i = 800;
                j20Var2.I = true;
                j20Var2.m = -1;
                j20Var2.t = true;
                j20Var2.a = 0L;
                j20Var2.d = 0L;
                j20Var2.b = m8Var.getDuration();
                org.telegram.messenger.j20 j20Var3 = gfVar.s;
                j20Var3.n = 30;
                j20Var3.c = 0L;
                long j10 = j20Var3.b;
                j20Var3.q = (int) ((j10 / 1000.0f) * 115200.0f);
                j20Var3.r = j10;
                org.telegram.messenger.h20 h20Var = new org.telegram.messenger.h20();
                h20Var.a = (byte) 0;
                if (document != null) {
                }
                if (e10 != null) {
                }
                if (this.Q) {
                }
            }
            int i112 = (int) 120.00001f;
            int i122 = (int) 560.0f;
            imageReceiver = m8Var.getImageReceiver();
            if (imageReceiver.m() == null) {
                Bitmap p10 = imageReceiver.m().p();
                f10 = 0.13f;
                document = document2;
                ImageReceiver imageReceiver2 = new ImageReceiver(null);
                imageReceiver2.v0(p10);
                float f11 = i112;
                float f12 = i122;
                imageReceiver2.y0(f11, f11, f12, f12);
                imageReceiver2.J0((int) (f12 * 0.13f));
                imageReceiver2.h(canvas, null);
                imageReceiver2.f();
                p10.recycle();
            } else {
                document = document2;
                f10 = 0.13f;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, z9);
                }
                float f13 = i112;
                float f14 = i122;
                imageReceiver.y0(f13, f13, f14, f14);
                imageReceiver.J0((int) (f14 * 0.13f));
                imageReceiver.h(canvas, null);
            }
            file = new File(org.telegram.messenger.w7.z(b10), org.telegram.messenger.iz.p() + "avatar_background.png");
            file.createNewFile();
            ByteArrayOutputStream byteArrayOutputStream22 = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream22);
            byte[] byteArray22 = byteArrayOutputStream22.toByteArray();
            FileOutputStream fileOutputStream22 = new FileOutputStream(file);
            fileOutputStream22.write(byteArray22);
            fileOutputStream22.flush();
            fileOutputStream22.close();
            if (m8Var.getImageReceiver().m() == null || m8Var.getImageReceiver().B() != null) {
                gfVar = new org.telegram.messenger.gf(0, file2.getPath(), 0, false, 0, 0);
                gfVar.c = file.getPath();
                if (m8Var.a == 0) {
                    TLRPC.TL_videoSizeEmojiMarkup tL_videoSizeEmojiMarkup = new TLRPC.TL_videoSizeEmojiMarkup();
                    tL_videoSizeEmojiMarkup.emoji_id = m8Var.a;
                    tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(m8Var.h.c));
                    int i13 = m8Var.h.d;
                    if (i13 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i13));
                    }
                    int i14 = m8Var.h.e;
                    if (i14 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i14));
                    }
                    int i15 = m8Var.h.f;
                    if (i15 != 0) {
                        tL_videoSizeEmojiMarkup.background_colors.add(Integer.valueOf(i15));
                    }
                    gfVar.S = tL_videoSizeEmojiMarkup;
                } else if (m8Var.b != null) {
                    TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
                    TLRPC.Document document3 = m8Var.b;
                    tL_videoSizeStickerMarkup.sticker_id = document3.id;
                    tL_videoSizeStickerMarkup.stickerset = org.telegram.messenger.ij.i1(document3);
                    tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(m8Var.h.c));
                    int i16 = m8Var.h.d;
                    if (i16 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i16));
                    }
                    int i17 = m8Var.h.e;
                    if (i17 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i17));
                    }
                    int i18 = m8Var.h.f;
                    if (i18 != 0) {
                        tL_videoSizeStickerMarkup.background_colors.add(Integer.valueOf(i18));
                    }
                    gfVar.S = tL_videoSizeStickerMarkup;
                }
                org.telegram.messenger.j20 j20Var4 = new org.telegram.messenger.j20();
                gfVar.s = j20Var4;
                j20Var4.o = file2.getPath();
                org.telegram.messenger.j20 j20Var22 = gfVar.s;
                j20Var22.k = 800;
                j20Var22.l = 800;
                j20Var22.h = 800;
                j20Var22.i = 800;
                j20Var22.I = true;
                j20Var22.m = -1;
                j20Var22.t = true;
                j20Var22.a = 0L;
                j20Var22.d = 0L;
                j20Var22.b = m8Var.getDuration();
                org.telegram.messenger.j20 j20Var32 = gfVar.s;
                j20Var32.n = 30;
                j20Var32.c = 0L;
                long j102 = j20Var32.b;
                j20Var32.q = (int) ((j102 / 1000.0f) * 115200.0f);
                j20Var32.r = j102;
                org.telegram.messenger.h20 h20Var2 = new org.telegram.messenger.h20();
                h20Var2.a = (byte) 0;
                e10 = document != null ? i5.e(org.telegram.messenger.p10.s0, j3) : document;
                if (e10 != null) {
                    h20Var2.q = i122;
                    h20Var2.r = i122;
                    h20Var2.f = 0.7f;
                    h20Var2.g = 0.7f;
                    h20Var2.c = 0.15f;
                    h20Var2.d = 0.15f;
                    h20Var2.B = e10;
                    h20Var2.C = null;
                    org.telegram.messenger.w7.G(org.telegram.messenger.p10.s0);
                    h20Var2.j = org.telegram.messenger.w7.J(e10, null, true, true).getAbsolutePath();
                    h20Var2.s = f10;
                    if (org.telegram.messenger.ij.K2(e10, true) || org.telegram.messenger.ij.O4(e10)) {
                        h20Var2.b = (byte) ((org.telegram.messenger.ij.K2(e10, true) ? (byte) 1 : b10) | h20Var2.b);
                    }
                    if (org.telegram.messenger.ij.C4(e10)) {
                        h20Var2.l = -1;
                        h20Var2.b = (byte) (h20Var2.b | 8);
                    }
                    gfVar.s.G = new ArrayList();
                    gfVar.s.G.add(h20Var2);
                }
            } else {
                gfVar = new org.telegram.messenger.gf(0, file.getPath(), 0, false, 0, 0);
            }
            hashMap.put(-1, gfVar);
            ChatAttachAlertPhotoLayout.t1.add(-1);
            diVar.T3.o1(7, true, false, 0, 0, 0L, diVar.f1(), false, 0L);
            if (!t8Var.Q) {
                org.telegram.ui.ActionBar.f2 f2Var2 = diVar.W1;
                if (f2Var2 != null) {
                    f2Var2.removeSelfFromStack();
                }
                t8Var.finishFragment();
            }
        }
        if (this.Q) {
            return;
        }
        finishFragment();
    }

    public final void l0(boolean z9, boolean z10, boolean z11) {
        if (this.U) {
            return;
        }
        i0();
        int i7 = 2;
        this.G = ValueAnimator.ofFloat(this.E, z9 ? 1.0f : 0.0f);
        if (z10) {
            this.a.x = this.E;
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.r4, new Object[0]);
        }
        this.G.addUpdateListener(new ch.u(6, this, z10));
        this.G.addListener(new org.telegram.ui.ActionBar.g(this, z9, z10, i7));
        if (z11) {
            this.G.setInterpolator(xq.h);
            this.G.setDuration(350L);
            this.G.setStartDelay(150L);
        } else {
            this.G.setInterpolator(xq.f);
            this.G.setDuration(250L);
        }
        this.G.start();
    }

    public final void m0(boolean z9, long j3, TLRPC.Document document) {
        m8 m8Var = this.a;
        m8Var.a = j3;
        di.d4 d4Var = m8Var.c;
        m8Var.b = document;
        if (j3 == 0) {
            d4Var.setAnimatedEmojiDrawable(null);
            this.a.c.getImageReceiver().r0(org.telegram.messenger.hc.b(document), "100_100", null, null, org.telegram.messenger.t5.f(document, org.telegram.ui.ActionBar.l6.m6, 0.2f, null), 0L, "tgs", document, 0);
        } else {
            d4Var.setAnimatedEmojiDrawable(new i5(14, this.currentAccount, j3));
            this.a.c.getImageReceiver().f();
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().m() != null) {
            this.a.getImageReceiver().m().y(0L, true, false);
        }
        if (this.a.getImageReceiver() != null && this.a.getImageReceiver().B() != null) {
            this.a.getImageReceiver().B().N(0, false, true);
        }
        this.n = true;
        s0();
    }

    public final void n0(boolean z9, float f10) {
        this.E = f10;
        float f11 = ((this.d - this.c) - org.telegram.messenger.g0.m) * f10;
        if (this.N == 0.0f) {
            this.r.setTranslationY(f11);
            this.y.setTranslationY(f11);
        }
        this.a.setTranslationY(((-(this.d - this.c)) / 2.0f) * f10);
        this.fragmentView.invalidate();
        if (z9) {
            this.a.setExpanded(f10 > 0.5f);
        }
    }

    public final void o0(float f10) {
        if (this.a0 != f10) {
            this.a0 = f10;
            int f11 = i0.a.f(f10, -16777216, -1);
            int o4 = i0.a.o(f11, 60);
            this.H.E(f11, false);
            this.R.setBackground(org.telegram.ui.ActionBar.l6.h0(o4, 3, -1));
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onBackPressed(boolean z9) {
        if (!this.n) {
            return super.onBackPressed(z9);
        }
        int i7 = 0;
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131747278, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.T = M0;
            u1Var.R = org.telegram.messenger.id.M0(2131751405, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747580, null), new h8(this, i7));
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
            showDialog(u1Var);
            u1Var.i();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), getClassGuid());
    }

    public final void p0(long j3) {
        m8 m8Var = this.a;
        if (m8Var == null) {
            return;
        }
        p8 p8Var = new p8();
        int[] iArr = c0[0];
        p8Var.c = iArr[0];
        p8Var.d = iArr[1];
        p8Var.e = iArr[2];
        p8Var.f = iArr[3];
        m8Var.b(p8Var, false);
        s0();
        m8 m8Var2 = this.a;
        m8Var2.a = j3;
        m8Var2.c.setAnimatedEmojiDrawable(new i5(14, this.currentAccount, j3));
        this.J.z1(p8Var);
        this.b.setForUser(false);
    }

    public final void q0(TLRPC.VideoSize videoSize) {
        p8 p8Var = new p8();
        p8Var.c = i0.a.o(videoSize.background_colors.get(0).intValue(), org.telegram.messenger.qs.e4);
        p8Var.d = videoSize.background_colors.size() > 1 ? i0.a.o(videoSize.background_colors.get(1).intValue(), org.telegram.messenger.qs.e4) : 0;
        p8Var.e = videoSize.background_colors.size() > 2 ? i0.a.o(videoSize.background_colors.get(2).intValue(), org.telegram.messenger.qs.e4) : 0;
        p8Var.f = videoSize.background_colors.size() > 3 ? i0.a.o(videoSize.background_colors.get(3).intValue(), org.telegram.messenger.qs.e4) : 0;
        this.a.b(p8Var, false);
        s0();
        TLRPC.Document document = null;
        if (videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) {
            m0(false, ((TLRPC.TL_videoSizeEmojiMarkup) videoSize).emoji_id, null);
        } else {
            TLRPC.TL_videoSizeStickerMarkup tL_videoSizeStickerMarkup = new TLRPC.TL_videoSizeStickerMarkup();
            TLRPC.TL_messages_stickerSet m0 = org.telegram.messenger.ui.b0(this.currentAccount).m0(tL_videoSizeStickerMarkup.stickerset, false);
            if (m0 != null) {
                for (int i7 = 0; i7 < m0.documents.size(); i7++) {
                    if (m0.documents.get(i7).id == tL_videoSizeStickerMarkup.sticker_id) {
                        document = m0.documents.get(i7);
                    }
                }
            }
            m0(false, 0L, document);
        }
        this.J.z1(p8Var);
        this.b.setForUser(true);
    }

    public final void r0(v8 v8Var) {
        p8 backgroundGradient = v8Var.getBackgroundGradient();
        m8 m8Var = this.a;
        if (m8Var == null) {
            return;
        }
        m8Var.b(backgroundGradient, false);
        s0();
        if (v8Var.getAnimatedEmoji() != null) {
            long h = v8Var.getAnimatedEmoji().h();
            m8 m8Var2 = this.a;
            m8Var2.a = h;
            m8Var2.c.setAnimatedEmojiDrawable(new i5(14, this.currentAccount, h));
        }
        this.J.z1(backgroundGradient);
        this.b.setForUser(false);
    }

    public final void s0() {
        boolean j02 = j0();
        if (this.x != j02) {
            fi.d dVar = this.y;
            this.x = j02;
            dVar.i(j02 ? this.w : this.s, true, true);
        }
    }
}
