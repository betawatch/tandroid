package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class u extends g.g {
    public static final int F0;
    public Interpolator A0;
    public final Interpolator B0;
    public final Interpolator C0;
    public final AccessibilityManager D0;
    public Button E;
    public final androidx.activity.i E0;
    public ImageButton F;
    public MediaRouteExpandCollapseButton G;
    public FrameLayout H;
    public LinearLayout I;
    public FrameLayout J;
    public ImageView K;
    public TextView L;
    public TextView M;
    public TextView N;
    public final boolean O;
    public final boolean P;
    public LinearLayout Q;
    public RelativeLayout R;
    public LinearLayout S;
    public View T;
    public OverlayListView U;
    public t V;
    public ArrayList W;
    public HashSet X;
    public HashSet Y;
    public HashSet Z;
    public SeekBar a0;
    public s b0;
    public p4.v c0;
    public int d0;
    public int e0;
    public int f0;
    public final int g0;
    public final p4.x h;
    public HashMap h0;
    public pf.b i0;
    public final r j0;
    public PlaybackStateCompat k0;
    public MediaDescriptionCompat l0;
    public q m0;
    public final d n;
    public Bitmap n0;
    public Uri o0;
    public boolean p0;
    public Bitmap q0;
    public final p4.v r;
    public int r0;
    public final Context s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public int x;
    public int x0;
    public Button y;
    public int y0;
    public int z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        F0 = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public u(Context context) {
        super(r5, r1 == 0 ? v7.d0.e(r5) : r1);
        int i10 = 1;
        ContextThemeWrapper a2 = v7.d0.a(context, true);
        int g10 = v7.d0.g(a2, R.attr.mediaRouteTheme);
        this.O = true;
        this.E0 = new androidx.activity.i(this, 6);
        Context context2 = getContext();
        this.s = context2;
        this.j0 = new r(this, 0);
        this.h = p4.x.d(context2);
        this.P = p4.x.g();
        this.n = new d(this, i10);
        this.r = p4.x.f();
        p(p4.x.e());
        this.g0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.D0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.B0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_linear_out_slow_in);
        this.C0 = AnimationUtils.loadInterpolator(a2, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void o(int i10, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i10;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i10, View view) {
        n nVar = new n(view, view.getLayoutParams().height, i10, 0);
        nVar.setDuration(this.x0);
        nVar.setInterpolator(this.A0);
        view.startAnimation(nVar);
    }

    public final boolean h() {
        return (this.l0 == null && this.k0 == null) ? false : true;
    }

    public final void i(boolean z10) {
        HashSet hashSet;
        int firstVisiblePosition = this.U.getFirstVisiblePosition();
        for (int i10 = 0; i10 < this.U.getChildCount(); i10++) {
            View childAt = this.U.getChildAt(i10);
            p4.v vVar = (p4.v) this.V.getItem(firstVisiblePosition + i10);
            if (!z10 || (hashSet = this.X) == null || !hashSet.contains(vVar)) {
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
        ArrayList arrayList = this.U.a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            p0 p0Var = (p0) obj;
            p0Var.j = true;
            p0Var.k = true;
            n4.y yVar = p0Var.l;
            if (yVar != null) {
                u uVar = (u) yVar.c;
                uVar.Z.remove((p4.v) yVar.b);
                uVar.V.notifyDataSetChanged();
            }
        }
        if (z10) {
            return;
        }
        j(false);
    }

    public final void j(boolean z10) {
        this.X = null;
        this.Y = null;
        this.v0 = false;
        if (this.w0) {
            this.w0 = false;
            t(z10);
        }
        this.U.setEnabled(true);
    }

    public final int k(int i10, int i11) {
        return i10 >= i11 ? (int) (((this.x * i11) / i10) + 0.5f) : (int) a4.a.A(this.x, 9.0f, 16.0f, 0.5f);
    }

    public final int l(boolean z10) {
        if (!z10 && this.S.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.Q.getPaddingBottom() + this.Q.getPaddingTop();
        if (z10) {
            paddingBottom += this.R.getMeasuredHeight();
        }
        if (this.S.getVisibility() == 0) {
            paddingBottom += this.S.getMeasuredHeight();
        }
        return (z10 && this.S.getVisibility() == 0) ? this.T.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        p4.v vVar = this.r;
        return vVar.e() && DesugarCollections.unmodifiableList(vVar.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.w = true;
        this.h.a(p4.r.c, this.n, 2);
        p(p4.x.e());
    }

    @Override // g.g, g.u, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        p pVar = new p(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.H = frameLayout;
        frameLayout.setOnClickListener(new p(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.I = linearLayout;
        linearLayout.setOnClickListener(new l());
        Context context = this.s;
        int f7 = v7.d0.f(context, 0, R.attr.colorPrimary);
        if (i0.a.e(f7, v7.d0.f(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            f7 = v7.d0.f(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.y = button;
        button.setText(R.string.mr_controller_disconnect);
        this.y.setTextColor(f7);
        this.y.setOnClickListener(pVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.E = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.E.setTextColor(f7);
        this.E.setOnClickListener(pVar);
        this.N = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(pVar);
        this.J = (FrameLayout) findViewById(R.id.mr_default_control);
        p pVar2 = new p(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.K = imageView;
        imageView.setOnClickListener(pVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(pVar2);
        this.Q = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.T = findViewById(R.id.mr_control_divider);
        this.R = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.L = (TextView) findViewById(R.id.mr_control_title);
        this.M = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.F = imageButton;
        imageButton.setOnClickListener(pVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.S = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.a0 = seekBar;
        p4.v vVar = this.r;
        seekBar.setTag(vVar);
        s sVar = new s(this);
        this.b0 = sVar;
        this.a0.setOnSeekBarChangeListener(sVar);
        this.U = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.W = new ArrayList();
        t tVar = new t(this, this.U.getContext(), this.W);
        this.V = tVar;
        this.U.setAdapter((ListAdapter) tVar);
        this.Z = new HashSet();
        LinearLayout linearLayout3 = this.Q;
        OverlayListView overlayListView = this.U;
        boolean n10 = n();
        int f10 = v7.d0.f(context, 0, R.attr.colorPrimary);
        int f11 = v7.d0.f(context, 0, R.attr.colorPrimaryDark);
        if (n10 && v7.d0.b(context, 0) == -570425344) {
            f11 = f10;
            f10 = -1;
        }
        linearLayout3.setBackgroundColor(f10);
        overlayListView.setBackgroundColor(f11);
        linearLayout3.setTag(Integer.valueOf(f10));
        overlayListView.setTag(Integer.valueOf(f11));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.a0;
        LinearLayout linearLayout4 = this.Q;
        int b10 = v7.d0.b(context, 0);
        if (Color.alpha(b10) != 255) {
            b10 = i0.a.h(b10, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b10, b10);
        HashMap hashMap = new HashMap();
        this.h0 = hashMap;
        hashMap.put(vVar, this.a0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.G = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.r = new p(this, 3);
        this.A0 = this.u0 ? this.B0 : this.C0;
        this.x0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.y0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.z0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
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

    @Override // g.g, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 25 && i10 != 24) {
            return super.onKeyDown(i10, keyEvent);
        }
        if (this.P || !this.u0) {
            this.r.k(i10 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // g.g, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 == 25 || i10 == 24) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public final void p(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        PlaybackStateCompat d;
        pf.b bVar = this.i0;
        r rVar = this.j0;
        if (bVar != null) {
            bVar.k0(rVar);
            this.i0 = null;
        }
        if (mediaSessionCompat$Token != null && this.w) {
            pf.b bVar2 = new pf.b(this.s, mediaSessionCompat$Token);
            this.i0 = bVar2;
            bVar2.f0(rVar);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.i0.b).a.getMetadata();
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
            this.l0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.i0.b;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.e;
            if (mediaSessionCompat$Token2.a() != null) {
                try {
                    d = mediaSessionCompat$Token2.a().d();
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e7);
                }
                this.k0 = d;
                r();
                q(false);
            }
            PlaybackState playbackState = hVar.a.getPlaybackState();
            d = playbackState != null ? PlaybackStateCompat.a(playbackState) : null;
            this.k0 = d;
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
        if (this.c0 != null) {
            this.s0 = true;
            this.t0 = z10 | this.t0;
            return;
        }
        this.s0 = false;
        this.t0 = false;
        p4.v vVar = this.r;
        if (!vVar.g() || vVar.d()) {
            dismiss();
            return;
        }
        if (this.v) {
            this.N.setText(vVar.d);
            this.y.setVisibility(vVar.j ? 0 : 8);
            if (this.p0) {
                Bitmap bitmap = this.q0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.K.setImageBitmap(this.q0);
                    this.K.setBackgroundColor(this.r0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.q0);
                }
                this.p0 = false;
                this.q0 = null;
                this.r0 = 0;
            }
            boolean z15 = this.P;
            if (z15 || !n()) {
                if (!this.u0 || z15) {
                    if (this.O) {
                        if (((!vVar.e() || p4.x.g()) ? vVar.o : 0) == 1) {
                            z11 = true;
                            if (z11) {
                                if (this.S.getVisibility() == 8) {
                                    this.S.setVisibility(0);
                                    this.a0.setMax(vVar.q);
                                    this.a0.setProgress(vVar.p);
                                    this.G.setVisibility(n() ? 0 : 8);
                                }
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
                this.S.setVisibility(8);
            } else {
                this.S.setVisibility(8);
                this.u0 = true;
                this.U.setVisibility(0);
                this.A0 = this.u0 ? this.B0 : this.C0;
                t(false);
            }
            if (h()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.l0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.l0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (vVar.r != -1) {
                    this.L.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.k0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.L.setText(R.string.mr_controller_no_media_selected);
                    } else if (isEmpty && isEmpty2) {
                        this.L.setText(R.string.mr_controller_no_info_available);
                    } else {
                        if (isEmpty) {
                            z12 = false;
                        } else {
                            this.L.setText(charSequence);
                            z12 = true;
                        }
                        if (!isEmpty2) {
                            this.M.setText(charSequence2);
                            z13 = true;
                            this.L.setVisibility(z12 ? 0 : 8);
                            this.M.setVisibility(z13 ? 0 : 8);
                            playbackStateCompat = this.k0;
                            if (playbackStateCompat != null) {
                                int i12 = playbackStateCompat.a;
                                boolean z16 = i12 == 6 || i12 == 3;
                                Context context = this.F.getContext();
                                if (z16) {
                                    if ((this.k0.e & 514) != 0) {
                                        i10 = R.attr.mediaRoutePauseDrawable;
                                        i11 = R.string.mr_controller_pause;
                                        this.F.setVisibility(z14 ? 0 : 8);
                                        if (z14) {
                                            this.F.setImageResource(v7.d0.g(context, i10));
                                            this.F.setContentDescription(context.getResources().getText(i11));
                                        }
                                    }
                                }
                                if (z16) {
                                    if ((this.k0.e & 1) != 0) {
                                        i10 = R.attr.mediaRouteStopDrawable;
                                        i11 = R.string.mr_controller_stop;
                                        this.F.setVisibility(z14 ? 0 : 8);
                                        if (z14) {
                                        }
                                    }
                                }
                                if (!z16) {
                                    if ((this.k0.e & 516) != 0) {
                                        i10 = R.attr.mediaRoutePlayDrawable;
                                        i11 = R.string.mr_controller_play;
                                        this.F.setVisibility(z14 ? 0 : 8);
                                        if (z14) {
                                        }
                                    }
                                }
                                z14 = false;
                                i10 = 0;
                                i11 = 0;
                                this.F.setVisibility(z14 ? 0 : 8);
                                if (z14) {
                                }
                            }
                        }
                        z13 = false;
                        this.L.setVisibility(z12 ? 0 : 8);
                        this.M.setVisibility(z13 ? 0 : 8);
                        playbackStateCompat = this.k0;
                        if (playbackStateCompat != null) {
                        }
                    }
                }
                z12 = true;
                z13 = false;
                this.L.setVisibility(z12 ? 0 : 8);
                this.M.setVisibility(z13 ? 0 : 8);
                playbackStateCompat = this.k0;
                if (playbackStateCompat != null) {
                }
            }
            t(z10);
        }
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.l0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        q qVar = this.m0;
        Bitmap bitmap2 = qVar == null ? this.n0 : qVar.a;
        Uri uri2 = qVar == null ? this.o0 : qVar.b;
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
        if (!n() || this.P) {
            q qVar2 = this.m0;
            if (qVar2 != null) {
                qVar2.cancel(true);
            }
            q qVar3 = new q(this);
            this.m0 = qVar3;
            qVar3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.s;
        int a2 = v7.c0.a(context);
        getWindow().setLayout(a2, -2);
        View decorView = getWindow().getDecorView();
        this.x = (a2 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.d0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.e0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.n0 = null;
        this.o0 = null;
        r();
        q(false);
    }

    public final void t(boolean z10) {
        this.J.requestLayout();
        this.J.getViewTreeObserver().addOnGlobalLayoutListener(new m(this, z10));
    }

    public final void u(boolean z10) {
        int i10 = 0;
        this.T.setVisibility((this.S.getVisibility() == 0 && z10) ? 0 : 8);
        LinearLayout linearLayout = this.Q;
        if (this.S.getVisibility() == 8 && !z10) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }
}
