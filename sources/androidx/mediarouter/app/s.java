package androidx.mediarouter.app;

import ag.q1;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import h7.e5;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class s extends g.f {
    public static final int B0;
    public Button A;
    public final q1 A0;
    public ImageButton B;
    public MediaRouteExpandCollapseButton C;
    public FrameLayout D;
    public LinearLayout E;
    public FrameLayout F;
    public ImageView G;
    public TextView H;
    public TextView I;
    public TextView J;
    public final boolean K;
    public final boolean L;
    public LinearLayout M;
    public RelativeLayout N;
    public LinearLayout O;
    public View P;
    public OverlayListView Q;
    public r R;
    public ArrayList S;
    public HashSet T;
    public HashSet U;
    public HashSet V;
    public SeekBar W;
    public q X;
    public c2.b0 Y;
    public int Z;
    public int a0;
    public int b0;
    public final int c0;
    public HashMap d0;
    public android.support.v4.media.session.p e0;
    public final p f0;
    public PlaybackStateCompat g0;
    public final c2.d0 h;
    public MediaDescriptionCompat h0;
    public o i0;
    public Bitmap j0;
    public Uri k0;
    public boolean l0;
    public Bitmap m0;
    public final c n;
    public int n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public final c2.b0 r;
    public boolean r0;
    public final Context s;
    public boolean s0;
    public int t0;
    public int u0;
    public boolean v;
    public int v0;
    public boolean w;
    public Interpolator w0;
    public int x;
    public final Interpolator x0;
    public Button y;
    public final Interpolator y0;
    public final AccessibilityManager z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        B0 = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public s(Context context) {
        super(r5, r1 == 0 ? e5.e(r5) : r1);
        int i10 = 1;
        ContextThemeWrapper a2 = e5.a(context, true);
        int g10 = e5.g(a2, R.attr.mediaRouteTheme);
        this.K = true;
        this.A0 = new q1(this, 7);
        Context context2 = getContext();
        this.s = context2;
        this.f0 = new p(this, 0);
        this.h = c2.d0.d(context2);
        this.L = c2.d0.g();
        this.n = new c(this, i10);
        this.r = c2.d0.f();
        p(c2.d0.e());
        this.c0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.z0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.x0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_linear_out_slow_in);
        this.y0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void o(int i10, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i10, View view) {
        l lVar = new l(view, view.getLayoutParams().height, i10, 0);
        lVar.setDuration(this.t0);
        lVar.setInterpolator(this.w0);
        view.startAnimation(lVar);
    }

    public final boolean h() {
        return (this.h0 == null && this.g0 == null) ? false : true;
    }

    public final void i(boolean z10) {
        HashSet hashSet;
        int firstVisiblePosition = this.Q.getFirstVisiblePosition();
        for (int i10 = 0; i10 < this.Q.getChildCount(); i10++) {
            View childAt = this.Q.getChildAt(i10);
            c2.b0 b0Var = (c2.b0) this.R.getItem(firstVisiblePosition + i10);
            if (!z10 || (hashSet = this.T) == null || !hashSet.contains(b0Var)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        ArrayList arrayList = this.Q.a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            n0 n0Var = (n0) obj;
            n0Var.j = true;
            n0Var.k = true;
            ze.b bVar = n0Var.l;
            if (bVar != null) {
                s sVar = (s) bVar.b;
                sVar.V.remove((c2.b0) bVar.a);
                sVar.R.notifyDataSetChanged();
            }
        }
        if (z10) {
            return;
        }
        j(false);
    }

    public final void j(boolean z10) {
        this.T = null;
        this.U = null;
        this.r0 = false;
        if (this.s0) {
            this.s0 = false;
            t(z10);
        }
        this.Q.setEnabled(true);
    }

    public final int k(int i10, int i11) {
        return i10 >= i11 ? (int) (((this.x * i11) / i10) + 0.5f) : (int) a4.w.d(this.x, 9.0f, 16.0f, 0.5f);
    }

    public final int l(boolean z10) {
        if (!z10 && this.O.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.M.getPaddingBottom() + this.M.getPaddingTop();
        if (z10) {
            paddingBottom += this.N.getMeasuredHeight();
        }
        if (this.O.getVisibility() == 0) {
            paddingBottom += this.O.getMeasuredHeight();
        }
        return (z10 && this.O.getVisibility() == 0) ? this.P.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        c2.b0 b0Var = this.r;
        return b0Var.e() && DesugarCollections.unmodifiableList(b0Var.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        this.h.a(c2.w.c, this.n, 2);
        p(c2.d0.e());
    }

    @Override // g.f, g.s, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        n nVar = new n(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.D = frameLayout;
        frameLayout.setOnClickListener(new n(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.E = linearLayout;
        linearLayout.setOnClickListener(new j());
        Context context = this.s;
        int f9 = e5.f(context, 0, R.attr.colorPrimary);
        if (i0.a.e(f9, e5.f(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            f9 = e5.f(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.y = button;
        button.setText(R.string.mr_controller_disconnect);
        this.y.setTextColor(f9);
        this.y.setOnClickListener(nVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.A = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.A.setTextColor(f9);
        this.A.setOnClickListener(nVar);
        this.J = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(nVar);
        this.F = (FrameLayout) findViewById(R.id.mr_default_control);
        n nVar2 = new n(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.G = imageView;
        imageView.setOnClickListener(nVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(nVar2);
        this.M = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.P = findViewById(R.id.mr_control_divider);
        this.N = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.H = (TextView) findViewById(R.id.mr_control_title);
        this.I = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.B = imageButton;
        imageButton.setOnClickListener(nVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.O = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.W = seekBar;
        c2.b0 b0Var = this.r;
        seekBar.setTag(b0Var);
        q qVar = new q(this);
        this.X = qVar;
        this.W.setOnSeekBarChangeListener(qVar);
        this.Q = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.S = new ArrayList();
        r rVar = new r(this, this.Q.getContext(), this.S);
        this.R = rVar;
        this.Q.setAdapter((ListAdapter) rVar);
        this.V = new HashSet();
        LinearLayout linearLayout3 = this.M;
        OverlayListView overlayListView = this.Q;
        boolean n10 = n();
        int f10 = e5.f(context, 0, R.attr.colorPrimary);
        int f11 = e5.f(context, 0, R.attr.colorPrimaryDark);
        if (n10 && e5.b(context, 0) == -570425344) {
            f11 = f10;
            f10 = -1;
        }
        linearLayout3.setBackgroundColor(f10);
        overlayListView.setBackgroundColor(f11);
        linearLayout3.setTag(Integer.valueOf(f10));
        overlayListView.setTag(Integer.valueOf(f11));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.W;
        LinearLayout linearLayout4 = this.M;
        int b10 = e5.b(context, 0);
        if (Color.alpha(b10) != 255) {
            b10 = i0.a.h(b10, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b10, b10);
        HashMap hashMap = new HashMap();
        this.d0 = hashMap;
        hashMap.put(b0Var, this.W);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.C = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.r = new n(this, 3);
        this.w0 = this.q0 ? this.x0 : this.y0;
        this.t0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.u0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.v0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.v = true;
        s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h.h(this.n);
        p(null);
        this.w = false;
        super.onDetachedFromWindow();
    }

    @Override // g.f, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 25 && i10 != 24) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.L || !this.q0) {
            this.r.k(i10 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // g.f, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 25 || i10 == 24) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public final void p(MediaSessionCompat$Token mediaSessionCompat$Token) {
        android.support.v4.media.session.p pVar = this.e0;
        p pVar2 = this.f0;
        if (pVar != null) {
            pVar.e(pVar2);
            this.e0 = null;
        }
        if (mediaSessionCompat$Token != null && this.w) {
            android.support.v4.media.session.p pVar3 = new android.support.v4.media.session.p(this.s, mediaSessionCompat$Token);
            this.e0 = pVar3;
            pVar3.d(pVar2);
            MediaMetadataCompat a2 = this.e0.a();
            this.h0 = a2 != null ? a2.a() : null;
            this.g0 = this.e0.b();
            r();
            q(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        PlaybackStateCompat playbackStateCompat;
        int i10;
        int i11;
        boolean z14 = true;
        if (this.Y != null) {
            this.o0 = true;
            this.p0 = z10 | this.p0;
            return;
        }
        this.o0 = false;
        this.p0 = false;
        c2.b0 b0Var = this.r;
        if (!b0Var.g() || b0Var.d()) {
            dismiss();
            return;
        }
        if (this.v) {
            this.J.setText(b0Var.d);
            this.y.setVisibility(b0Var.j ? 0 : 8);
            if (this.l0) {
                Bitmap bitmap = this.m0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.G.setImageBitmap(this.m0);
                    this.G.setBackgroundColor(this.n0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.m0);
                }
                this.l0 = false;
                this.m0 = null;
                this.n0 = 0;
            }
            boolean z15 = this.L;
            if (z15 || !n()) {
                if (!this.q0 || z15) {
                    if (this.K) {
                        if (((!b0Var.e() || c2.d0.g()) ? b0Var.o : 0) == 1) {
                            z11 = true;
                            if (z11) {
                                if (this.O.getVisibility() == 8) {
                                    this.O.setVisibility(0);
                                    this.W.setMax(b0Var.q);
                                    this.W.setProgress(b0Var.p);
                                    this.C.setVisibility(n() ? 0 : 8);
                                }
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
                this.O.setVisibility(8);
            } else {
                this.O.setVisibility(8);
                this.q0 = true;
                this.Q.setVisibility(0);
                this.w0 = this.q0 ? this.x0 : this.y0;
                t(false);
            }
            if (h()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.h0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.h0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (b0Var.r != -1) {
                    this.H.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.g0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.H.setText(R.string.mr_controller_no_media_selected);
                    } else if (isEmpty && isEmpty2) {
                        this.H.setText(R.string.mr_controller_no_info_available);
                    } else {
                        if (isEmpty) {
                            z12 = false;
                        } else {
                            this.H.setText(charSequence);
                            z12 = true;
                        }
                        if (!isEmpty2) {
                            this.I.setText(charSequence2);
                            z13 = true;
                            this.H.setVisibility(z12 ? 0 : 8);
                            this.I.setVisibility(z13 ? 0 : 8);
                            playbackStateCompat = this.g0;
                            if (playbackStateCompat != null) {
                                int i12 = playbackStateCompat.a;
                                boolean z16 = i12 == 6 || i12 == 3;
                                Context context = this.B.getContext();
                                if (z16) {
                                    if ((this.g0.e & 514) != 0) {
                                        i10 = R.attr.mediaRoutePauseDrawable;
                                        i11 = R.string.mr_controller_pause;
                                        this.B.setVisibility(z14 ? 0 : 8);
                                        if (z14) {
                                            this.B.setImageResource(e5.g(context, i10));
                                            this.B.setContentDescription(context.getResources().getText(i11));
                                        }
                                    }
                                }
                                if (z16) {
                                    if ((this.g0.e & 1) != 0) {
                                        i10 = R.attr.mediaRouteStopDrawable;
                                        i11 = R.string.mr_controller_stop;
                                        this.B.setVisibility(z14 ? 0 : 8);
                                        if (z14) {
                                        }
                                    }
                                }
                                if (!z16) {
                                    if ((this.g0.e & 516) != 0) {
                                        i10 = R.attr.mediaRoutePlayDrawable;
                                        i11 = R.string.mr_controller_play;
                                        this.B.setVisibility(z14 ? 0 : 8);
                                        if (z14) {
                                        }
                                    }
                                }
                                z14 = false;
                                i10 = 0;
                                i11 = 0;
                                this.B.setVisibility(z14 ? 0 : 8);
                                if (z14) {
                                }
                            }
                        }
                        z13 = false;
                        this.H.setVisibility(z12 ? 0 : 8);
                        this.I.setVisibility(z13 ? 0 : 8);
                        playbackStateCompat = this.g0;
                        if (playbackStateCompat != null) {
                        }
                    }
                }
                z12 = true;
                z13 = false;
                this.H.setVisibility(z12 ? 0 : 8);
                this.I.setVisibility(z13 ? 0 : 8);
                playbackStateCompat = this.g0;
                if (playbackStateCompat != null) {
                }
            }
            t(z10);
        }
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.h0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        o oVar = this.i0;
        Bitmap bitmap2 = oVar == null ? this.j0 : oVar.a;
        Uri uri2 = oVar == null ? this.k0 : oVar.b;
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!n() || this.L) {
            o oVar2 = this.i0;
            if (oVar2 != null) {
                oVar2.cancel(true);
            }
            o oVar3 = new o(this);
            this.i0 = oVar3;
            oVar3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.s;
        int a2 = h7.k0.a(context);
        getWindow().setLayout(a2, -2);
        View decorView = getWindow().getDecorView();
        this.x = (a2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.Z = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.a0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.b0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.j0 = null;
        this.k0 = null;
        r();
        q(false);
    }

    public final void t(boolean z10) {
        this.F.requestLayout();
        this.F.getViewTreeObserver().addOnGlobalLayoutListener(new k(this, z10));
    }

    public final void u(boolean z10) {
        int i10 = 0;
        this.P.setVisibility((this.O.getVisibility() == 0 && z10) ? 0 : 8);
        LinearLayout linearLayout = this.M;
        if (this.O.getVisibility() == 8 && !z10) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }
}
