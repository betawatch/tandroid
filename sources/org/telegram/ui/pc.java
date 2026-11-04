package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class pc extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public TLRPC.EmojiStatus E;
    public TLRPC.WallPaper F;
    public TLRPC.WallPaper G;
    public TLRPC.WallPaper H;
    public Drawable I;
    public SpannableStringBuilder J;
    public boolean K;
    public org.telegram.ui.Components.ch0 L;
    public org.telegram.ui.ActionBar.q0 M;
    public org.telegram.ui.Components.tj0 N;
    public cc O;
    public FrameLayout P;
    public gi.d Q;
    public zb R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public final long a;
    public int a0;
    public int b;
    public int b0;
    public TL_stories.TL_premium_boostsStatus c;
    public int c0;
    public boolean d;
    public int d0;
    public int e;
    public int e0;
    public int f;
    public int f0;
    public int g0;
    public long h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public org.telegram.ui.ActionBar.d2 m0;
    public long n;
    public ac n0;
    public float o0;
    public ValueAnimator p0;
    public boolean q0;
    public int r;
    public org.telegram.ui.ActionBar.e6 r0;
    public int s;
    public final SparseIntArray s0;
    public final org.telegram.ui.ActionBar.t4 t0;
    public final org.telegram.ui.ActionBar.t4 u0;
    public final org.telegram.ui.ActionBar.t4 v0;
    public long w;
    public final org.telegram.ui.ActionBar.t4 w0;
    public long x;
    public final Drawable x0;
    public TLRPC.EmojiStatus y;
    public final Drawable y0;
    public final Paint z0;

    public pc(long j10) {
        super(null);
        boolean q10 = org.telegram.ui.ActionBar.k6.I.q();
        this.K = q10;
        this.S = 0;
        this.q0 = q10;
        this.s0 = new SparseIntArray();
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setStrokeWidth(1.0f);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.resourceProvider));
        this.x0 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_check_s).mutate();
        this.y0 = org.telegram.messenger.t0.b.getDrawable(R.drawable.msg_halfcheck).mutate();
        this.a = j10;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
        if (M0 != null) {
            this.b = M0.level;
        }
        org.telegram.messenger.hp.s1(this.currentAccount).G0().a(j10, new mi.f(10, this, M0));
        this.resourceProvider = new oc(this);
        this.t0 = new org.telegram.ui.ActionBar.t4(0, false, false, this.resourceProvider);
        this.u0 = new org.telegram.ui.ActionBar.t4(0, false, true, this.resourceProvider);
        this.v0 = new org.telegram.ui.ActionBar.t4(0, true, false, this.resourceProvider);
        this.w0 = new org.telegram.ui.ActionBar.t4(0, true, true, this.resourceProvider);
    }

    public static void Z(pc pcVar) {
        org.telegram.ui.ActionBar.e6 e6Var = pcVar.resourceProvider;
        if (e6Var instanceof oc) {
            pc pcVar2 = ((oc) e6Var).a;
            pcVar2.K = !pcVar2.K;
            pcVar2.k1();
            pcVar2.g1(false);
        } else {
            pcVar.K = !pcVar.K;
            pcVar.k1();
        }
        pcVar.b1(pcVar.K, true);
        pcVar.g1(false);
        org.telegram.ui.ActionBar.k6.Am++;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a0(pc pcVar, org.telegram.messenger.e3 e3Var) {
        int i3;
        int i10;
        long j10 = pcVar.a;
        if (pcVar.e != pcVar.f) {
            org.telegram.messenger.xo xoVar = pcVar.getMessagesController().q4;
            org.telegram.messenger.wo d = xoVar == null ? null : xoVar.d(pcVar.f);
            if (d != null && d.l(pcVar.d) > pcVar.b) {
                i3 = d.l(pcVar.d);
                if (pcVar.r != pcVar.s) {
                    org.telegram.messenger.xo xoVar2 = pcVar.getMessagesController().r4;
                    org.telegram.messenger.wo d10 = xoVar2 != null ? xoVar2.d(pcVar.s) : null;
                    if (d10 != null && d10.l(pcVar.d) > pcVar.b) {
                        i3 = d10.l(pcVar.d);
                        i10 = 24;
                        int i11 = i3;
                        if (pcVar.h != pcVar.n && pcVar.getMessagesController().q5 > pcVar.b) {
                            i10 = 27;
                        }
                        if (pcVar.w != pcVar.x && pcVar.Q0() > pcVar.b) {
                            i10 = 28;
                        }
                        if (!org.telegram.messenger.m5.a(pcVar.y, pcVar.E) && pcVar.M0() > pcVar.b) {
                            i10 = !(pcVar.E instanceof TLRPC.TL_emojiStatusCollectible) ? 26 : 25;
                        }
                        if (!org.telegram.messenger.d4.v(pcVar.F, pcVar.G)) {
                            i10 = !TextUtils.isEmpty(org.telegram.messenger.d4.j(pcVar.G)) ? 22 : 23;
                        }
                        int i12 = i10;
                        if (pcVar.getParentActivity() == null || pcVar.getParentActivity() == null) {
                            return;
                        }
                        xb xbVar = new xb(pcVar, pcVar.getParentActivity(), i12, pcVar.currentAccount, pcVar.getResourceProvider(), i11);
                        xbVar.A1(e3Var);
                        xbVar.z1(pcVar.c, true);
                        xbVar.B1(j10);
                        TLRPC.Chat M0 = pcVar.getMessagesController().M0(Long.valueOf(-j10));
                        if (M0 != null) {
                            xbVar.J2 = new org.telegram.messenger.voip.l0(27, pcVar, M0);
                        }
                        pcVar.showDialog(xbVar);
                        pcVar.Q.setLoading(false);
                        return;
                    }
                }
                i10 = 20;
                int i112 = i3;
                if (pcVar.h != pcVar.n) {
                    i10 = 27;
                }
                if (pcVar.w != pcVar.x) {
                    i10 = 28;
                }
                if (!org.telegram.messenger.m5.a(pcVar.y, pcVar.E)) {
                    if (!(pcVar.E instanceof TLRPC.TL_emojiStatusCollectible)) {
                    }
                }
                if (!org.telegram.messenger.d4.v(pcVar.F, pcVar.G)) {
                }
                int i122 = i10;
                if (pcVar.getParentActivity() == null) {
                    return;
                } else {
                    return;
                }
            }
        }
        i3 = 0;
        if (pcVar.r != pcVar.s) {
        }
        i10 = 20;
        int i1122 = i3;
        if (pcVar.h != pcVar.n) {
        }
        if (pcVar.w != pcVar.x) {
        }
        if (!org.telegram.messenger.m5.a(pcVar.y, pcVar.E)) {
        }
        if (!org.telegram.messenger.d4.v(pcVar.F, pcVar.G)) {
        }
        int i1222 = i10;
        if (pcVar.getParentActivity() == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b0(pc pcVar, TLRPC.ChatFull chatFull, View view, int i3) {
        long j10;
        long f10;
        int i10;
        long j11 = pcVar.a;
        int i11 = 0;
        if (!(view instanceof dc)) {
            if (i3 == pcVar.f0) {
                pcVar.s = -1;
                pcVar.x = 0L;
                if (pcVar.E instanceof TLRPC.TL_emojiStatusCollectible) {
                    pcVar.E = null;
                }
                pcVar.i1();
                pcVar.e1(true);
                pcVar.j1();
                pcVar.g1(true);
                return;
            }
            if (i3 == pcVar.Y) {
                Activity parentActivity = pcVar.getParentActivity();
                long j12 = pcVar.a;
                org.telegram.ui.ActionBar.e6 e6Var = pcVar.resourceProvider;
                ub ubVar = new ub(pcVar, i11);
                f fVar = new f(pcVar, 10);
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = pcVar.c;
                int i12 = org.telegram.ui.Components.vo.d2;
                org.telegram.ui.Components.bi biVar = new org.telegram.ui.Components.bi(parentActivity, pcVar, false, false, false, e6Var);
                biVar.n = true;
                biVar.A1(org.telegram.messenger.bd.M0(2131752139, null));
                biVar.U3 = new org.telegram.ui.Components.mo(biVar, tL_premium_boostsStatus, e6Var, fVar, j12, ubVar, pcVar);
                biVar.y1(1, false);
                biVar.e1();
                biVar.b2.i0();
                biVar.show();
                return;
            }
            return;
        }
        if (i3 == pcVar.k0) {
            if (chatFull == null) {
                return;
            }
            g50 g50Var = new g50(-j11);
            g50Var.j0(chatFull);
            pcVar.presentFragment(g50Var);
            return;
        }
        if (i3 == pcVar.V) {
            f10 = pcVar.n;
        } else if (i3 == pcVar.d0) {
            f10 = pcVar.x;
        } else {
            if (i3 != pcVar.g0) {
                j10 = 0;
                if (i3 != pcVar.i0) {
                    int O0 = pcVar.O0();
                    TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = pcVar.c;
                    if (tL_premium_boostsStatus2 != null && tL_premium_boostsStatus2.level < O0) {
                        pcVar.a1(29);
                        return;
                    }
                    g50 g50Var2 = new g50(-j11, 0);
                    g50Var2.j0(chatFull);
                    pcVar.presentFragment(g50Var2);
                    return;
                }
                dc dcVar = (dc) view;
                boolean z10 = i3 == pcVar.g0;
                tb tbVar = new tb(pcVar, i3, view);
                int w02 = pcVar.E instanceof TLRPC.TL_emojiStatusCollectible ? org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.v6, pcVar.resourceProvider) : dcVar.f;
                if (pcVar.R == null) {
                    org.telegram.ui.Components.e5 e5Var = dcVar.c;
                    x01[] x01VarArr = new x01[1];
                    boolean z11 = ((float) (dcVar.getHeight() + dcVar.getTop())) > ((float) pcVar.N.getMeasuredHeight()) / 2.0f;
                    float L = org.telegram.messenger.g0.L(330.0f);
                    Point point = org.telegram.messenger.g0.q;
                    int min = (int) Math.min(L, point.y * 0.75f);
                    int min2 = (int) Math.min(org.telegram.messenger.g0.L(324.0f), point.x * 0.95f);
                    Drawable[] drawableArr = e5Var.f;
                    Drawable drawable = drawableArr[1];
                    if (drawable != null) {
                        if (drawable instanceof org.telegram.ui.Components.g5) {
                            ((org.telegram.ui.Components.g5) drawable).o(e5Var);
                        }
                        drawableArr[1] = null;
                    }
                    e5Var.f();
                    dcVar.f();
                    Rect rect = org.telegram.messenger.g0.Q;
                    rect.set(e5Var.getBounds());
                    int L2 = z11 ? (org.telegram.messenger.g0.L(12.0f) + (-rect.centerY())) - min : (-(dcVar.getHeight() - rect.centerY())) - org.telegram.messenger.g0.L(16.0f);
                    int centerX = rect.centerX() - (point.x - min2);
                    if (z10) {
                        i10 = z11 ? 10 : 9;
                    } else {
                        i10 = z11 ? 5 : 7;
                    }
                    yb ybVar = new yb(pcVar, pcVar, pcVar.getParentActivity(), Integer.valueOf(centerX), i10, pcVar.getResourceProvider(), z11 ? 24 : 16, w02, tbVar, x01VarArr);
                    ybVar.h1 = true;
                    ybVar.setSelected(j10 == 0 ? null : Long.valueOf(j10));
                    ybVar.setSaveState(3);
                    ybVar.y(e5Var, dcVar);
                    zb zbVar = new zb(pcVar, ybVar);
                    pcVar.R = zbVar;
                    x01VarArr[0] = zbVar;
                    zbVar.showAsDropDown(dcVar, 0, L2, 53);
                    x01VarArr[0].b();
                    return;
                }
                return;
            }
            TLRPC.EmojiStatus emojiStatus = pcVar.E;
            f10 = emojiStatus instanceof TLRPC.TL_emojiStatusCollectible ? ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id : org.telegram.messenger.m5.f(emojiStatus);
        }
        j10 = f10;
        if (i3 != pcVar.i0) {
        }
    }

    public static void f1(View view) {
        if (view instanceof dc) {
            ((dc) view).updateColors();
            return;
        }
        if (view instanceof org.telegram.ui.Cells.l8) {
            ((org.telegram.ui.Cells.l8) view).updateColors();
        } else if (view instanceof gc) {
            ((gc) view).updateColors();
        } else if (view instanceof nc) {
            ((nc) view).updateColors();
        }
    }

    public final void B0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar == null) {
            return;
        }
        kVar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.A8) : -1);
        this.actionBar.D((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.v8) : -1, false);
    }

    public void C0() {
        B0();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.s8));
        }
        org.telegram.ui.Components.tj0 tj0Var = this.N;
        if (tj0Var != null && this.d) {
            tj0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
        FrameLayout frameLayout = this.P;
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D0() {
        long j10;
        int i3;
        int i10;
        boolean z10;
        int i11;
        int i12;
        long j11;
        long j12;
        ?? r72;
        if (this.c == null || this.Q.R) {
            return;
        }
        int i13 = this.b;
        int Z0 = Z0();
        long j13 = this.a;
        int i14 = 1;
        if (i13 < Z0) {
            this.Q.setLoading(true);
            getMessagesController().G0().b(j13, this.c, new ub(this, i14));
            return;
        }
        int[] iArr = {0};
        final ai.v1 v1Var = new ai.v1(this, new boolean[]{false}, new int[]{0}, iArr, 5);
        long j14 = -j13;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j14));
        if (M0 == null) {
            org.telegram.messenger.a8.d("channel is null in ChannelColorAcitivity");
            org.telegram.messenger.k5.o(null, 2131743889, org.telegram.ui.Components.fc.a0(this), R.raw.error, 36);
            return;
        }
        this.Q.setLoading(true);
        final int i15 = 2;
        if (this.e == this.f) {
            j10 = j13;
            i3 = 3;
            if (this.h == this.n) {
                i10 = 3;
                z10 = true;
                i11 = 0;
                if (this.r == this.s || this.w != this.x) {
                    TLRPC.TL_channels_updateColor tL_channels_updateColor = new TLRPC.TL_channels_updateColor();
                    tL_channels_updateColor.channel = getMessagesController().h1(j14);
                    tL_channels_updateColor.for_profile = z10;
                    if (M0.profile_color == null) {
                        M0.profile_color = new TLRPC.TL_peerColor();
                        M0.flags2 |= 256;
                    }
                    i12 = this.s;
                    if (i12 < 0) {
                        tL_channels_updateColor.flags |= 4;
                        tL_channels_updateColor.color = i12;
                        TLRPC.PeerColor peerColor = M0.profile_color;
                        peerColor.flags |= 1;
                        peerColor.color = i12;
                    } else {
                        M0.profile_color.flags &= -2;
                    }
                    j11 = this.x;
                    if (j11 == 0) {
                        tL_channels_updateColor.flags |= 1;
                        tL_channels_updateColor.background_emoji_id = j11;
                        TLRPC.PeerColor peerColor2 = M0.profile_color;
                        peerColor2.flags |= 2;
                        peerColor2.background_emoji_id = j11;
                    } else {
                        TLRPC.PeerColor peerColor3 = M0.profile_color;
                        peerColor3.flags &= -3;
                        peerColor3.background_emoji_id = 0L;
                    }
                    iArr[i11] = iArr[i11] + 1;
                    final int i16 = i10;
                    getConnectionsManager().sendRequest(tL_channels_updateColor, new RequestDelegate(this) { // from class: org.telegram.ui.sb
                        public final /* synthetic */ pc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i16) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                }
                if (org.telegram.messenger.d4.v(this.F, this.G)) {
                    TLRPC.TL_messages_setChatWallPaper tL_messages_setChatWallPaper = new TLRPC.TL_messages_setChatWallPaper();
                    j12 = j10;
                    tL_messages_setChatWallPaper.peer = getMessagesController().j1(j12);
                    TLRPC.WallPaper wallPaper = this.G;
                    if (wallPaper != null) {
                        if (TextUtils.isEmpty(org.telegram.messenger.d4.j(wallPaper))) {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.WallPaper wallPaper2 = this.G;
                            if (wallPaper2 instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_inputWallPaper tL_inputWallPaper = new TLRPC.TL_inputWallPaper();
                                TLRPC.WallPaper wallPaper3 = this.G;
                                tL_inputWallPaper.id = wallPaper3.id;
                                tL_inputWallPaper.access_hash = wallPaper3.access_hash;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaper;
                            } else if (wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) {
                                TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile = new TLRPC.TL_inputWallPaperNoFile();
                                tL_inputWallPaperNoFile.id = this.G.id;
                                tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile;
                            }
                        } else {
                            tL_messages_setChatWallPaper.flags |= 1;
                            TLRPC.TL_inputWallPaperNoFile tL_inputWallPaperNoFile2 = new TLRPC.TL_inputWallPaperNoFile();
                            tL_messages_setChatWallPaper.wallpaper = tL_inputWallPaperNoFile2;
                            tL_inputWallPaperNoFile2.id = 0L;
                            tL_messages_setChatWallPaper.flags |= 4;
                            TLRPC.TL_wallPaperSettings tL_wallPaperSettings = new TLRPC.TL_wallPaperSettings();
                            tL_messages_setChatWallPaper.settings = tL_wallPaperSettings;
                            tL_wallPaperSettings.flags |= 128;
                            tL_wallPaperSettings.emoticon = org.telegram.messenger.d4.j(this.G);
                        }
                    }
                    iArr[i11] = iArr[i11] + 1;
                    final int i17 = i11;
                    getConnectionsManager().sendRequest(tL_messages_setChatWallPaper, new RequestDelegate(this) { // from class: org.telegram.ui.sb
                        public final /* synthetic */ pc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i17) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                    TLRPC.ChatFull N0 = getMessagesController().N0(j14);
                    org.telegram.messenger.d4.f(this.currentAccount).r(j12, this.G);
                    if (N0 != null) {
                        TLRPC.WallPaper wallPaper4 = this.G;
                        if (wallPaper4 == null) {
                            N0.flags2 &= -129;
                            N0.wallpaper = null;
                        } else {
                            N0.flags2 |= 128;
                            N0.wallpaper = wallPaper4;
                        }
                        getMessagesController().R3(N0);
                        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
                        Boolean bool = Boolean.FALSE;
                        notificationCenter.k(org.telegram.messenger.hs.T, N0, 0, bool, bool);
                    }
                } else {
                    j12 = j10;
                }
                if (org.telegram.messenger.m5.a(this.y, this.E)) {
                    TLRPC.TL_channels_updateEmojiStatus tL_channels_updateEmojiStatus = new TLRPC.TL_channels_updateEmojiStatus();
                    tL_channels_updateEmojiStatus.channel = getMessagesController().h1(j14);
                    TLRPC.EmojiStatus emojiStatus = this.E;
                    if (emojiStatus == null || (emojiStatus instanceof TLRPC.TL_emojiStatusEmpty)) {
                        tL_channels_updateEmojiStatus.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        M0.emoji_status = new TLRPC.TL_emojiStatusEmpty();
                        M0.flags2 &= -513;
                    } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                        TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
                        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                        tL_inputEmojiStatusCollectible.collectible_id = tL_emojiStatusCollectible.collectible_id;
                        tL_inputEmojiStatusCollectible.flags = tL_emojiStatusCollectible.flags;
                        tL_inputEmojiStatusCollectible.until = tL_emojiStatusCollectible.until;
                        tL_channels_updateEmojiStatus.emoji_status = tL_inputEmojiStatusCollectible;
                        M0.emoji_status = this.E;
                        M0.flags |= 512;
                    } else {
                        tL_channels_updateEmojiStatus.emoji_status = emojiStatus;
                        M0.emoji_status = emojiStatus;
                        M0.flags |= 512;
                    }
                    getMessagesController().j5(j12, this.E);
                    r72 = 0;
                    final int i18 = 1;
                    iArr[0] = iArr[0] + 1;
                    getConnectionsManager().sendRequest(tL_channels_updateEmojiStatus, new RequestDelegate(this) { // from class: org.telegram.ui.sb
                        public final /* synthetic */ pc b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.tgnet.RequestDelegate
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (i18) {
                                case 0:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                case 1:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                case 2:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                                default:
                                    if (tLObject instanceof TLRPC.Updates) {
                                        this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                                    }
                                    v1Var.a(tL_error);
                                    break;
                            }
                        }
                    });
                } else {
                    r72 = 0;
                }
                if (iArr[r72] != 0) {
                    finishFragment();
                    this.Q.setLoading(r72);
                    return;
                }
                getMessagesController().Q3(M0, r72);
                org.telegram.messenger.hs notificationCenter2 = getNotificationCenter();
                int i19 = org.telegram.messenger.hp.C8;
                Object[] objArr = new Object[1];
                objArr[r72] = Integer.valueOf(TLObject.FLAG_19);
                notificationCenter2.k(org.telegram.messenger.hs.r, objArr);
                return;
            }
        } else {
            j10 = j13;
            i3 = 3;
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor2 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor2.channel = getMessagesController().h1(j14);
        tL_channels_updateColor2.for_profile = false;
        if (M0.color == null) {
            M0.color = new TLRPC.TL_peerColor();
            M0.flags2 |= 128;
        }
        int i20 = tL_channels_updateColor2.flags;
        tL_channels_updateColor2.flags = i20 | 4;
        int i21 = this.f;
        tL_channels_updateColor2.color = i21;
        TLRPC.PeerColor peerColor4 = M0.color;
        i10 = i3;
        int i22 = peerColor4.flags;
        int i23 = i22 | 1;
        peerColor4.flags = i23;
        peerColor4.color = i21;
        z10 = true;
        i11 = 0;
        long j15 = this.n;
        if (j15 != 0) {
            tL_channels_updateColor2.flags = i20 | 5;
            tL_channels_updateColor2.background_emoji_id = j15;
            peerColor4.flags = i22 | 3;
            peerColor4.background_emoji_id = j15;
        } else {
            peerColor4.flags = i23 & (-3);
            peerColor4.background_emoji_id = 0L;
        }
        iArr[0] = iArr[0] + 1;
        getConnectionsManager().sendRequest(tL_channels_updateColor2, new RequestDelegate(this) { // from class: org.telegram.ui.sb
            public final /* synthetic */ pc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i15) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                }
            }
        });
        if (this.r == this.s) {
        }
        TLRPC.TL_channels_updateColor tL_channels_updateColor3 = new TLRPC.TL_channels_updateColor();
        tL_channels_updateColor3.channel = getMessagesController().h1(j14);
        tL_channels_updateColor3.for_profile = z10;
        if (M0.profile_color == null) {
        }
        i12 = this.s;
        if (i12 < 0) {
        }
        j11 = this.x;
        if (j11 == 0) {
        }
        iArr[i11] = iArr[i11] + 1;
        final int i162 = i10;
        getConnectionsManager().sendRequest(tL_channels_updateColor3, new RequestDelegate(this) { // from class: org.telegram.ui.sb
            public final /* synthetic */ pc b;

            {
                this.b = this;
            }

            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i162) {
                    case 0:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                    case 1:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                    case 2:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                    default:
                        if (tLObject instanceof TLRPC.Updates) {
                            this.b.getMessagesController().O3((TLRPC.Updates) tLObject, false);
                        }
                        v1Var.a(tL_error);
                        break;
                }
            }
        });
        if (org.telegram.messenger.d4.v(this.F, this.G)) {
        }
        if (org.telegram.messenger.m5.a(this.y, this.E)) {
        }
        if (iArr[r72] != 0) {
        }
    }

    public void E0() {
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(getParentActivity(), this.resourceProvider);
        this.N = tj0Var;
        tj0Var.setSections(false);
    }

    public final View F0(int i3) {
        for (int i10 = 0; i10 < this.N.getChildCount(); i10++) {
            View childAt = this.N.getChildAt(i10);
            this.N.getClass();
            if (RecyclerView.R(childAt) == i3) {
                return childAt;
            }
        }
        return null;
    }

    public int G0() {
        return getMessagesController().u5;
    }

    public int H0() {
        return 0;
    }

    public int I0() {
        return 0;
    }

    public final TLRPC.Document J0(TLRPC.StickerSet stickerSet) {
        if (stickerSet != null && stickerSet.thumb_document_id == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0);
            }
        }
        return null;
    }

    public final long K0(TLRPC.StickerSet stickerSet) {
        if (stickerSet == null) {
            return 0L;
        }
        long j10 = stickerSet.thumb_document_id;
        if (j10 == 0) {
            TLRPC.TL_messages_stickerSet Y = getMediaDataController().Y(stickerSet);
            if (!Y.documents.isEmpty()) {
                return Y.documents.get(0).id;
            }
        }
        return j10;
    }

    public int L0() {
        return 2131752412;
    }

    public int M0() {
        return getMessagesController().s5;
    }

    public int N0() {
        return 2131752413;
    }

    public int O0() {
        return 0;
    }

    public int P0() {
        return 3;
    }

    public int Q0() {
        return getMessagesController().r5;
    }

    public int R0() {
        return 2131752320;
    }

    public int S0() {
        return 0;
    }

    public int T0() {
        return 0;
    }

    public int U0() {
        return 2131752263;
    }

    public int V0() {
        return getMessagesController().t5;
    }

    public int W0() {
        return 2131752264;
    }

    public final boolean X0() {
        return (this.e == this.f && this.h == this.n && this.r == this.s && this.w == this.x && org.telegram.messenger.m5.a(this.y, this.E) && org.telegram.messenger.d4.v(this.F, this.G)) ? false : true;
    }

    public boolean Y0() {
        return false;
    }

    public final int Z0() {
        int i3 = 0;
        if (this.e != this.f) {
            org.telegram.messenger.xo xoVar = getMessagesController().q4;
            org.telegram.messenger.wo d = xoVar == null ? null : xoVar.d(this.f);
            if (d != null) {
                i3 = Math.max(0, d.l(this.d));
            }
        }
        if (this.h != this.n) {
            i3 = Math.max(i3, getMessagesController().q5);
        }
        if (this.r != this.s) {
            org.telegram.messenger.xo xoVar2 = getMessagesController().r4;
            org.telegram.messenger.wo d10 = xoVar2 != null ? xoVar2.d(this.s) : null;
            if (d10 != null) {
                i3 = Math.max(i3, d10.l(this.d));
            }
        }
        if (this.w != this.x) {
            i3 = Math.max(i3, Q0());
        }
        if (!org.telegram.messenger.m5.a(this.y, this.E)) {
            i3 = Math.max(i3, M0());
        }
        return !org.telegram.messenger.d4.v(this.F, this.G) ? Math.max(i3, V0()) : i3;
    }

    public final void b1(boolean z10, boolean z11) {
        if (this.q0 == z10) {
            return;
        }
        this.q0 = z10;
        if (z11) {
            org.telegram.ui.Components.ch0 ch0Var = this.L;
            ch0Var.P(z10 ? ch0Var.e[0] : 0);
            org.telegram.ui.Components.ch0 ch0Var2 = this.L;
            if (ch0Var2 != null) {
                ch0Var2.start();
                return;
            }
            return;
        }
        int i3 = z10 ? this.L.e[0] - 1 : 0;
        this.L.N(i3, false, true);
        this.L.P(i3);
        org.telegram.ui.ActionBar.q0 q0Var = this.M;
        if (q0Var != null) {
            q0Var.invalidate();
        }
    }

    public final void c1() {
        if (getVisibleDialog() != null) {
            return;
        }
        final int i3 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.bd.M0(2131752426, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752425, null);
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751370, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.wb
            public final /* synthetic */ pc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i10) {
                switch (i3) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.D0();
                        break;
                }
            }
        });
        final int i10 = 1;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new org.telegram.ui.ActionBar.p1(this) { // from class: org.telegram.ui.wb
            public final /* synthetic */ pc b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.ActionBar.p1
            public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i102) {
                switch (i10) {
                    case 0:
                        this.b.finishFragment();
                        break;
                    default:
                        this.b.D0();
                        break;
                }
            }
        });
        showDialog(s1Var);
        org.telegram.ui.ActionBar.r6.V((TextView) s1Var.d(-2), org.telegram.ui.ActionBar.k6.q7, getResourceProvider());
    }

    @Override // org.telegram.ui.ActionBar.d2
    public View createView(Context context) {
        org.telegram.ui.ActionBar.q0 d;
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = -this.a;
        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j10));
        if (M0 != null) {
            int F = org.telegram.messenger.t3.F(M0);
            this.f = F;
            this.e = F;
            long G = org.telegram.messenger.t3.G(M0);
            this.n = G;
            this.h = G;
            int I = org.telegram.messenger.t3.I(M0);
            this.s = I;
            this.r = I;
            long J = org.telegram.messenger.t3.J(M0);
            this.x = J;
            this.w = J;
            TLRPC.EmojiStatus emojiStatus = M0.emoji_status;
            this.E = emojiStatus;
            this.y = emojiStatus;
        }
        TLRPC.ChatFull N0 = getMessagesController().N0(j10);
        if (N0 != null) {
            TLRPC.WallPaper wallPaper = N0.wallpaper;
            this.G = wallPaper;
            this.F = wallPaper;
            String j11 = org.telegram.messenger.d4.j(wallPaper);
            if (j11 != null && j11.length() == 0) {
                this.H = this.F;
            }
        }
        int i3 = 4;
        o9 o9Var = new o9(this, i3);
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.setBackButtonImage(R.drawable.ic_ab_back);
            this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131752427, null));
            this.simpleActionBar.setActionBarMenuOnItemClick(o9Var);
        } else {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
            this.actionBar.setTitle(org.telegram.messenger.bd.M0(2131752427, null));
            this.actionBar.setActionBarMenuOnItemClick(o9Var);
        }
        org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
        this.L = ch0Var;
        ch0Var.h = true;
        if (this.K) {
            ch0Var.M(35);
            this.L.P(36);
        } else {
            ch0Var.P(0);
            this.L.M(0);
        }
        this.L.a0 = true;
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.J9, this.resourceProvider);
        this.L.Q(w02, "Sunny");
        this.L.Q(w02, "Path 6");
        this.L.Q(w02, "Path");
        this.L.Q(w02, "Path 5");
        org.telegram.ui.ActionBar.y4 y4Var2 = this.simpleActionBar;
        if (y4Var2 != null) {
            org.telegram.ui.ActionBar.e5 o10 = y4Var2.o();
            org.telegram.ui.Components.ch0 ch0Var2 = this.L;
            o10.getClass();
            d = o10.c(1, 0, null, ch0Var2, org.telegram.messenger.g0.L(48.0f), null);
        } else {
            d = this.actionBar.q().d(1, this.L);
        }
        this.M = d;
        FrameLayout frameLayout = new FrameLayout(context);
        j1();
        E0();
        if (this.d) {
            this.N.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        } else {
            setHasOwnBackground(true);
            this.N.setSectionsDrawBackground(true);
        }
        org.telegram.ui.Components.tj0 tj0Var = this.N;
        cc ccVar = new cc(this);
        this.O = ccVar;
        tj0Var.setAdapter(ccVar);
        new u4.s(3);
        this.N.setLayoutManager(new u4.b0());
        frameLayout.addView(this.N, b8.mf.d(-1, -1.0f, org.telegram.messenger.hs.E1, 0.0f, 0.0f, 0.0f, this.d ? 68.0f : 0.0f));
        this.N.setOnItemClickListener(new ei.q4(i3, this, N0));
        u4.k kVar = new u4.k();
        kVar.n(350L);
        kVar.o(org.telegram.ui.Components.xq.h);
        kVar.C = false;
        kVar.m = false;
        this.N.setItemAnimator(kVar);
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        dVar.setRoundRadius(24);
        this.Q = dVar;
        dVar.i(org.telegram.messenger.bd.M0(2131754218, null), false, true);
        this.Q.setOnClickListener(new a(this, 11));
        e1(false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.P = frameLayout2;
        if (this.d) {
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout2, getResourceProvider());
        } else {
            frameLayout2.setBackground(getBaseSimpleGlass().b(this.P));
        }
        this.P.addView(this.Q, b8.mf.d(-1, 48.0f, 80, 10.0f, 10.0f, 10.0f, 10.0f));
        frameLayout.addView(this.P, b8.mf.e(-1, 68, 80));
        setBulletinDelegate(new x8(this, 1));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-this.a));
            this.c = tL_premium_boostsStatus;
            int i3 = tL_premium_boostsStatus.level;
            this.b = i3;
            if (M0 != null) {
                M0.level = i3;
            }
            cc ccVar = this.O;
            if (ccVar != null) {
                ccVar.f();
            }
            e1(true);
        }
    }

    public void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.p3;
        long j10 = this.a;
        if (i3 == i11) {
            if (j10 == ((Long) objArr[2]).longValue()) {
                d1((TL_stories.TL_premium_boostsStatus) objArr[0]);
            }
        } else if (i3 == org.telegram.messenger.hs.V2) {
            if (((Boolean) objArr[1]).booleanValue()) {
                return;
            }
            getMessagesController().G0().a(j10, new ub(this, 2));
        } else if (i3 == org.telegram.messenger.hs.y1 && j10 == ((Long) objArr[0]).longValue()) {
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var == null || q4Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public void e1(boolean z10) {
        if (this.Q == null || this.c == null) {
            return;
        }
        int Z0 = Z0();
        if (this.b >= Z0) {
            this.Q.g(null, z10);
            return;
        }
        if (this.J == null) {
            this.J = new SpannableStringBuilder("l");
            org.telegram.ui.Components.wp wpVar = new org.telegram.ui.Components.wp(R.drawable.mini_switch_lock, 0);
            wpVar.n = 1;
            this.J.setSpan(wpVar, 0, 1, 33);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) org.telegram.messenger.bd.G(Z0, "BoostLevelRequired", new Object[0]));
        this.Q.g(spannableStringBuilder, z10);
    }

    public void g1(boolean z10) {
        org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
        if (y4Var != null) {
            y4Var.updateColors();
        } else {
            this.actionBar.setTitleColor((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.A8) : -1);
            this.actionBar.D((!this.d || this.s == -1) ? getThemedColor(org.telegram.ui.ActionBar.k6.v8) : -1, false);
            this.actionBar.C(getThemedColor(org.telegram.ui.ActionBar.k6.t8), false);
        }
        if (z10) {
            return;
        }
        this.O.f();
        org.telegram.messenger.g0.d0(this.N, new ei.e(this));
        if (this.d) {
            this.P.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.k6.a7));
        }
        this.Q.updateColors();
        setNavigationBarColor(getNavigationBarColor());
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        if (this.d) {
            return null;
        }
        return this.N;
    }

    public final void h1(boolean z10) {
        org.telegram.messenger.zi messageObject;
        View F0 = F0(this.T);
        View F02 = F0(this.U);
        View F03 = F0(this.V);
        View F04 = F0(this.X);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
            org.telegram.ui.Cells.z9 z9Var = (org.telegram.ui.Cells.z9) F0;
            org.telegram.ui.Cells.q1[] cells = z9Var.getCells();
            for (int i3 = 0; i3 < cells.length; i3++) {
                org.telegram.ui.Cells.q1 q1Var = cells[i3];
                if (q1Var != null && (messageObject = q1Var.getMessageObject()) != null) {
                    messageObject.c1 = this.f;
                    messageObject.d1 = this.n;
                    cells[i3].setAvatar(messageObject);
                    cells[i3].invalidate();
                }
            }
            Drawable f10 = gi.y5.f(this.I, this.currentAccount, this.G, this.K);
            this.I = f10;
            z9Var.setOverrideBackground(f10);
        }
        if (F02 instanceof zl0) {
            ((zl0) F02).a(this.f, z10);
        } else if (F02 instanceof gc) {
            ((gc) F02).a(this.f, z10);
        }
        if (F03 instanceof dc) {
            dc dcVar = (dc) F03;
            dcVar.a(this.currentAccount, this.f, true);
            dcVar.c(this.n, false, z10);
        }
        if (F04 instanceof nc) {
            nc ncVar = (nc) F04;
            String j10 = org.telegram.messenger.d4.j(this.G);
            if (j10 == null && this.G == null && this.H != null) {
                j10 = "❌";
            }
            ncVar.a(j10, z10);
            ncVar.setGalleryWallpaper(this.H);
        }
    }

    public final void i1() {
        TLRPC.StickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        View F0 = F0(this.a0);
        View F02 = F0(this.c0);
        View F03 = F0(this.d0);
        View F04 = F0(this.g0);
        View F05 = F0(this.i0);
        View F06 = F0(this.k0);
        if (F0 instanceof ic) {
            TLRPC.EmojiStatus emojiStatus = this.E;
            if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
                ic icVar = (ic) F0;
                hc hcVar = icVar.b;
                org.telegram.messenger.wo a10 = org.telegram.messenger.wo.a(emojiStatus);
                hcVar.c(a10, true);
                icVar.a.c(a10, true);
                hcVar.d(((TLRPC.TL_emojiStatusCollectible) this.E).pattern_document_id, true, true);
            } else {
                ic icVar2 = (ic) F0;
                hc hcVar2 = icVar2.b;
                int i3 = this.s;
                hcVar2.b(i3, true);
                icVar2.a.b(icVar2.h.currentAccount, i3, true);
                hcVar2.d(this.x, false, true);
            }
            ic icVar3 = (ic) F0;
            hc hcVar3 = icVar3.b;
            hcVar3.e(org.telegram.messenger.m5.f(this.E), false, true);
            hcVar3.a(this.f);
            icVar3.updateColors();
        }
        if (F02 instanceof zl0) {
            ((zl0) F02).a(this.s, true);
        } else if (F02 instanceof gc) {
            ((gc) F02).a(this.f, true);
        }
        if (F03 instanceof dc) {
            dc dcVar = (dc) F03;
            dcVar.a(this.currentAccount, this.s, false);
            dcVar.c(this.x, false, true);
        }
        if (F04 instanceof dc) {
            TLRPC.EmojiStatus emojiStatus2 = this.E;
            if (emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) {
                ((dc) F04).b(org.telegram.messenger.wo.a(emojiStatus2));
            } else {
                ((dc) F04).a(this.currentAccount, this.s, false);
            }
            ((dc) F04).c(org.telegram.messenger.m5.f(this.E), org.telegram.messenger.m5.B(this.E), true);
        }
        boolean z10 = F05 instanceof dc;
        long j10 = this.a;
        if (z10) {
            dc dcVar2 = (dc) F05;
            dcVar2.a(this.currentAccount, this.s, false);
            TLRPC.ChatFull N0 = getMessagesController().N0(-j10);
            if (N0 == null || (stickerSet2 = N0.emojiset) == null) {
                dcVar2.c(0L, false, false);
            } else {
                dcVar2.c(K0(stickerSet2), false, false);
            }
        }
        if (F06 instanceof dc) {
            TLRPC.ChatFull N02 = getMessagesController().N0(-j10);
            if (N02 == null || (stickerSet = N02.stickerset) == null) {
                ((dc) F06).c(0L, false, false);
            } else {
                ((dc) F06).d(J0(stickerSet));
            }
        }
        j1();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return !this.d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X0() || this.b < Z0();
    }

    public void j1() {
        cc ccVar;
        cc ccVar2;
        this.T = 0;
        int i3 = 1 + 1;
        this.U = 1;
        this.V = i3;
        this.W = i3 + 1;
        this.X = i3 + 2;
        this.Y = i3 + 3;
        this.Z = i3 + 4;
        this.a0 = i3 + 5;
        this.c0 = i3 + 6;
        int i10 = i3 + 8;
        this.S = i10;
        this.d0 = i3 + 7;
        if (this.x != 0 || this.s >= 0 || (this.E instanceof TLRPC.TL_emojiStatusCollectible)) {
            boolean z10 = this.f0 >= 0;
            this.S = i3 + 9;
            this.f0 = i10;
            if (!z10 && (ccVar = this.O) != null) {
                ccVar.i(i10);
                this.O.g(this.d0);
            }
        } else {
            int i11 = this.f0;
            this.f0 = -1;
            if (i11 >= 0 && (ccVar2 = this.O) != null) {
                ccVar2.s(i11);
                this.O.g(this.d0);
            }
        }
        int i12 = this.S;
        this.e0 = i12;
        this.g0 = i12 + 1;
        this.S = i12 + 3;
        this.h0 = i12 + 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[LOOP:1: B:32:0x009b->B:34:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k1() {
        SparseIntArray T0;
        int[] iArr;
        int i3;
        org.telegram.ui.ActionBar.g6 k10;
        View F0;
        SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string) == null || org.telegram.ui.ActionBar.k6.Q0(string).q()) {
            string = "Blue";
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.Q0(string2) == null || !org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
            string2 = "Dark Blue";
        }
        org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
        if (!string.equals(string2)) {
            str2 = string2;
        } else if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
            str2 = string2;
            org.telegram.ui.ActionBar.j6 Q0 = !this.K ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str);
            this.s0.clear();
            String[] strArr = new String[1];
            String str3 = Q0.d;
            T0 = str3 == null ? org.telegram.ui.ActionBar.k6.T0(null, str3, strArr) : org.telegram.ui.ActionBar.k6.T0(new File(Q0.b), null, strArr);
            iArr = org.telegram.ui.ActionBar.k6.em;
            if (iArr != null) {
                for (int i10 = 0; i10 < iArr.length; i10++) {
                    this.s0.put(i10, iArr[i10]);
                }
            }
            for (i3 = 0; i3 < T0.size(); i3++) {
                this.s0.put(T0.keyAt(i3), T0.valueAt(i3));
            }
            k10 = Q0.k(false);
            if (k10 != null) {
                k10.d(T0, this.s0);
            }
            this.z0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.resourceProvider));
            this.I = gi.y5.f(this.I, this.currentAccount, this.G, this.K);
            F0 = F0(this.T);
            if (F0 instanceof org.telegram.ui.Cells.z9) {
                return;
            }
            ((org.telegram.ui.Cells.z9) F0).setOverrideBackground(this.I);
            return;
        }
        str = string;
        if (!this.K) {
        }
        this.s0.clear();
        String[] strArr2 = new String[1];
        String str32 = Q0.d;
        if (str32 == null) {
        }
        iArr = org.telegram.ui.ActionBar.k6.em;
        if (iArr != null) {
        }
        while (i3 < T0.size()) {
        }
        k10 = Q0.k(false);
        if (k10 != null) {
        }
        this.z0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.d7, this.resourceProvider));
        this.I = gi.y5.f(this.I, this.currentAccount, this.G, this.K);
        F0 = F0(this.T);
        if (F0 instanceof org.telegram.ui.Cells.z9) {
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (this.b < Z0() || !X0()) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        c1();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public boolean onFragmentCreate() {
        getMediaDataController().Y0();
        getNotificationCenter().c(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().c(this, org.telegram.messenger.hs.p3);
        getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.V2);
        getNotificationCenter().n(this, org.telegram.messenger.hs.p3);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onInsets(int i3, int i10, int i11, int i12) {
        if (this.d || this.P == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(68.0f) + i12;
        ViewGroup.LayoutParams layoutParams = this.P.getLayoutParams();
        if (layoutParams.height != L) {
            layoutParams.height = L;
            this.P.setLayoutParams(layoutParams);
        }
        if (this.P.getPaddingLeft() != i3 || this.P.getPaddingRight() != i11 || this.P.getPaddingBottom() != i12) {
            this.P.setPadding(i3, 0, i11, i12);
        }
        pi.a.e(this.N, i10, i12, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), org.telegram.messenger.g0.L(68.0f));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            C0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i0.b bVar = this.mSystemInsets;
        onInsets(bVar.a, bVar.b, bVar.c, bVar.d);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void setResourceProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.r0 = e6Var;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return !this.d;
    }

    public void a1(int i3) {
    }
}
