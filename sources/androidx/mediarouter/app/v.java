package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
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
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class v extends g.f {
    public static final int C0;
    public final AccessibilityManager A0;
    public Button B;
    public final androidx.activity.i B0;
    public ImageButton C;
    public MediaRouteExpandCollapseButton D;
    public FrameLayout E;
    public LinearLayout F;
    public FrameLayout G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public final boolean L;
    public final boolean M;
    public LinearLayout N;
    public RelativeLayout O;
    public LinearLayout P;
    public View Q;
    public OverlayListView R;
    public u S;
    public ArrayList T;
    public HashSet U;
    public HashSet V;
    public HashSet W;
    public SeekBar X;
    public t Y;
    public c2.a0 Z;
    public int a0;
    public int b0;
    public int c0;
    public final int d0;
    public HashMap e0;
    public bf.b f0;
    public final s g0;
    public final c2.c0 h;
    public PlaybackStateCompat h0;
    public MediaDescriptionCompat i0;
    public r j0;
    public Bitmap k0;
    public Uri l0;
    public boolean m0;
    public final e n;
    public Bitmap n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public final c2.a0 r;
    public boolean r0;
    public final Context s;
    public boolean s0;
    public boolean t0;
    public int u0;
    public boolean v;
    public int v0;
    public boolean w;
    public int w0;
    public int x;
    public Interpolator x0;
    public Button y;
    public final Interpolator y0;
    public final Interpolator z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        C0 = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v(Context context) {
        super(r5, r1 == 0 ? j7.z.e(r5) : r1);
        int i10 = 1;
        ContextThemeWrapper a2 = j7.z.a(context, true);
        int g10 = j7.z.g(a2, R.attr.mediaRouteTheme);
        this.L = true;
        this.B0 = new androidx.activity.i(this, 6);
        Context context2 = getContext();
        this.s = context2;
        this.g0 = new s(this, 0);
        this.h = c2.c0.d(context2);
        this.M = c2.c0.g();
        this.n = new e(this, i10);
        this.r = c2.c0.f();
        p(c2.c0.e());
        this.d0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.A0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.y0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_linear_out_slow_in);
        this.z0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void o(int i10, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i10, View view) {
        o oVar = new o(view, view.getLayoutParams().height, i10, 0);
        oVar.setDuration(this.u0);
        oVar.setInterpolator(this.x0);
        view.startAnimation(oVar);
    }

    public final boolean h() {
        return (this.i0 == null && this.h0 == null) ? false : true;
    }

    public final void i(boolean z4) {
        HashSet hashSet;
        int firstVisiblePosition = this.R.getFirstVisiblePosition();
        for (int i10 = 0; i10 < this.R.getChildCount(); i10++) {
            View childAt = this.R.getChildAt(i10);
            c2.a0 a0Var = (c2.a0) this.S.getItem(firstVisiblePosition + i10);
            if (!z4 || (hashSet = this.U) == null || !hashSet.contains(a0Var)) {
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
        ArrayList arrayList = this.R.a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            q0 q0Var = (q0) obj;
            q0Var.j = true;
            q0Var.k = true;
            bf.b bVar = q0Var.l;
            if (bVar != null) {
                v vVar = (v) bVar.c;
                vVar.W.remove((c2.a0) bVar.b);
                vVar.S.notifyDataSetChanged();
            }
        }
        if (z4) {
            return;
        }
        j(false);
    }

    public final void j(boolean z4) {
        this.U = null;
        this.V = null;
        this.s0 = false;
        if (this.t0) {
            this.t0 = false;
            t(z4);
        }
        this.R.setEnabled(true);
    }

    public final int k(int i10, int i11) {
        return i10 >= i11 ? (int) (((this.x * i11) / i10) + 0.5f) : (int) android.support.v4.media.a.d(this.x, 9.0f, 16.0f, 0.5f);
    }

    public final int l(boolean z4) {
        if (!z4 && this.P.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.N.getPaddingBottom() + this.N.getPaddingTop();
        if (z4) {
            paddingBottom += this.O.getMeasuredHeight();
        }
        if (this.P.getVisibility() == 0) {
            paddingBottom += this.P.getMeasuredHeight();
        }
        return (z4 && this.P.getVisibility() == 0) ? this.Q.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        c2.a0 a0Var = this.r;
        return a0Var.e() && DesugarCollections.unmodifiableList(a0Var.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        this.h.a(c2.v.c, this.n, 2);
        p(c2.c0.e());
    }

    @Override // g.f, g.s, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        q qVar = new q(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new q(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.F = linearLayout;
        linearLayout.setOnClickListener(new m());
        Context context = this.s;
        int f10 = j7.z.f(context, 0, R.attr.colorPrimary);
        if (i0.a.e(f10, j7.z.f(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            f10 = j7.z.f(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.y = button;
        button.setText(R.string.mr_controller_disconnect);
        this.y.setTextColor(f10);
        this.y.setOnClickListener(qVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.B = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.B.setTextColor(f10);
        this.B.setOnClickListener(qVar);
        this.K = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(qVar);
        this.G = (FrameLayout) findViewById(R.id.mr_default_control);
        q qVar2 = new q(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.H = imageView;
        imageView.setOnClickListener(qVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(qVar2);
        this.N = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.Q = findViewById(R.id.mr_control_divider);
        this.O = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.I = (TextView) findViewById(R.id.mr_control_title);
        this.J = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.C = imageButton;
        imageButton.setOnClickListener(qVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.P = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.X = seekBar;
        c2.a0 a0Var = this.r;
        seekBar.setTag(a0Var);
        t tVar = new t(this);
        this.Y = tVar;
        this.X.setOnSeekBarChangeListener(tVar);
        this.R = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.T = new ArrayList();
        u uVar = new u(this, this.R.getContext(), this.T);
        this.S = uVar;
        this.R.setAdapter((ListAdapter) uVar);
        this.W = new HashSet();
        LinearLayout linearLayout3 = this.N;
        OverlayListView overlayListView = this.R;
        boolean n10 = n();
        int f11 = j7.z.f(context, 0, R.attr.colorPrimary);
        int f12 = j7.z.f(context, 0, R.attr.colorPrimaryDark);
        if (n10 && j7.z.b(context, 0) == -570425344) {
            f12 = f11;
            f11 = -1;
        }
        linearLayout3.setBackgroundColor(f11);
        overlayListView.setBackgroundColor(f12);
        linearLayout3.setTag(Integer.valueOf(f11));
        overlayListView.setTag(Integer.valueOf(f12));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.X;
        LinearLayout linearLayout4 = this.N;
        int b10 = j7.z.b(context, 0);
        if (Color.alpha(b10) != 255) {
            b10 = i0.a.h(b10, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b10, b10);
        HashMap hashMap = new HashMap();
        this.e0 = hashMap;
        hashMap.put(a0Var, this.X);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.D = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.r = new q(this, 3);
        this.x0 = this.r0 ? this.y0 : this.z0;
        this.u0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.v0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.w0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
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
        if (this.M || !this.r0) {
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
        MediaMetadataCompat mediaMetadataCompat;
        bf.b bVar = this.f0;
        s sVar = this.g0;
        if (bVar != null) {
            bVar.e0(sVar);
            this.f0 = null;
        }
        if (mediaSessionCompat$Token != null && this.w) {
            bf.b bVar2 = new bf.b(this.s, mediaSessionCompat$Token);
            this.f0 = bVar2;
            bVar2.Y(sVar);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.f0.b).a.getMetadata();
            if (metadata != null) {
                a0.f fVar = MediaMetadataCompat.d;
                Parcel obtain = Parcel.obtain();
                metadata.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                mediaMetadataCompat.b = metadata;
            } else {
                mediaMetadataCompat = null;
            }
            this.i0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
            this.h0 = this.f0.P();
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
    public final void q(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        PlaybackStateCompat playbackStateCompat;
        int i10;
        int i11;
        boolean z13 = true;
        if (this.Z != null) {
            this.p0 = true;
            this.q0 = z4 | this.q0;
            return;
        }
        this.p0 = false;
        this.q0 = false;
        c2.a0 a0Var = this.r;
        if (!a0Var.g() || a0Var.d()) {
            dismiss();
            return;
        }
        if (this.v) {
            this.K.setText(a0Var.d);
            this.y.setVisibility(a0Var.j ? 0 : 8);
            if (this.m0) {
                Bitmap bitmap = this.n0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.H.setImageBitmap(this.n0);
                    this.H.setBackgroundColor(this.o0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.n0);
                }
                this.m0 = false;
                this.n0 = null;
                this.o0 = 0;
            }
            boolean z14 = this.M;
            if (z14 || !n()) {
                if (!this.r0 || z14) {
                    if (this.L) {
                        if (((!a0Var.e() || c2.c0.g()) ? a0Var.o : 0) == 1) {
                            z10 = true;
                            if (z10) {
                                if (this.P.getVisibility() == 8) {
                                    this.P.setVisibility(0);
                                    this.X.setMax(a0Var.q);
                                    this.X.setProgress(a0Var.p);
                                    this.D.setVisibility(n() ? 0 : 8);
                                }
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                    }
                }
                this.P.setVisibility(8);
            } else {
                this.P.setVisibility(8);
                this.r0 = true;
                this.R.setVisibility(0);
                this.x0 = this.r0 ? this.y0 : this.z0;
                t(false);
            }
            if (h()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.i0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.i0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (a0Var.r != -1) {
                    this.I.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.h0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.I.setText(R.string.mr_controller_no_media_selected);
                    } else if (isEmpty && isEmpty2) {
                        this.I.setText(R.string.mr_controller_no_info_available);
                    } else {
                        if (isEmpty) {
                            z11 = false;
                        } else {
                            this.I.setText(charSequence);
                            z11 = true;
                        }
                        if (!isEmpty2) {
                            this.J.setText(charSequence2);
                            z12 = true;
                            this.I.setVisibility(z11 ? 0 : 8);
                            this.J.setVisibility(z12 ? 0 : 8);
                            playbackStateCompat = this.h0;
                            if (playbackStateCompat != null) {
                                int i12 = playbackStateCompat.a;
                                boolean z15 = i12 == 6 || i12 == 3;
                                Context context = this.C.getContext();
                                if (z15) {
                                    if ((this.h0.e & 514) != 0) {
                                        i10 = R.attr.mediaRoutePauseDrawable;
                                        i11 = R.string.mr_controller_pause;
                                        this.C.setVisibility(z13 ? 0 : 8);
                                        if (z13) {
                                            this.C.setImageResource(j7.z.g(context, i10));
                                            this.C.setContentDescription(context.getResources().getText(i11));
                                        }
                                    }
                                }
                                if (z15) {
                                    if ((this.h0.e & 1) != 0) {
                                        i10 = R.attr.mediaRouteStopDrawable;
                                        i11 = R.string.mr_controller_stop;
                                        this.C.setVisibility(z13 ? 0 : 8);
                                        if (z13) {
                                        }
                                    }
                                }
                                if (!z15) {
                                    if ((this.h0.e & 516) != 0) {
                                        i10 = R.attr.mediaRoutePlayDrawable;
                                        i11 = R.string.mr_controller_play;
                                        this.C.setVisibility(z13 ? 0 : 8);
                                        if (z13) {
                                        }
                                    }
                                }
                                z13 = false;
                                i10 = 0;
                                i11 = 0;
                                this.C.setVisibility(z13 ? 0 : 8);
                                if (z13) {
                                }
                            }
                        }
                        z12 = false;
                        this.I.setVisibility(z11 ? 0 : 8);
                        this.J.setVisibility(z12 ? 0 : 8);
                        playbackStateCompat = this.h0;
                        if (playbackStateCompat != null) {
                        }
                    }
                }
                z11 = true;
                z12 = false;
                this.I.setVisibility(z11 ? 0 : 8);
                this.J.setVisibility(z12 ? 0 : 8);
                playbackStateCompat = this.h0;
                if (playbackStateCompat != null) {
                }
            }
            t(z4);
        }
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.i0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        r rVar = this.j0;
        Bitmap bitmap2 = rVar == null ? this.k0 : rVar.a;
        Uri uri2 = rVar == null ? this.l0 : rVar.b;
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
        if (!n() || this.M) {
            r rVar2 = this.j0;
            if (rVar2 != null) {
                rVar2.cancel(true);
            }
            r rVar3 = new r(this);
            this.j0 = rVar3;
            rVar3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.s;
        int a2 = j7.y.a(context);
        getWindow().setLayout(a2, -2);
        View decorView = getWindow().getDecorView();
        this.x = (a2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.a0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.b0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.c0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.k0 = null;
        this.l0 = null;
        r();
        q(false);
    }

    public final void t(boolean z4) {
        this.G.requestLayout();
        this.G.getViewTreeObserver().addOnGlobalLayoutListener(new n(this, z4));
    }

    public final void u(boolean z4) {
        int i10 = 0;
        this.Q.setVisibility((this.P.getVisibility() == 0 && z4) ? 0 : 8);
        LinearLayout linearLayout = this.N;
        if (this.P.getVisibility() == 8 && !z4) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }
}
