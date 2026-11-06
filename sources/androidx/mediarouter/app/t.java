package androidx.mediarouter.app;

import a8.a7;
import a8.b7;
import a8.ra;
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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class t extends g.f {
    public static final int F0;
    public Interpolator A0;
    public final Interpolator B0;
    public final Interpolator C0;
    public Button D;
    public final AccessibilityManager D0;
    public Button E;
    public final ra E0;
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
    public s V;
    public ArrayList W;
    public HashSet X;
    public HashSet Y;
    public HashSet Z;
    public SeekBar a0;
    public r b0;
    public s4.v c0;
    public int d0;
    public int e0;
    public int f0;
    public final int g0;
    public final s4.x h;
    public HashMap h0;
    public wf.b i0;
    public final q j0;
    public PlaybackStateCompat k0;
    public MediaDescriptionCompat l0;
    public p m0;
    public final c n;
    public Bitmap n0;
    public Uri o0;
    public boolean p0;
    public Bitmap q0;
    public final s4.v r;
    public int r0;
    public final Context s;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public int x0;
    public int y;
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
    public t(Context context) {
        super(r5, r1 == 0 ? b7.e(r5) : r1);
        int i7 = 1;
        ContextThemeWrapper a10 = b7.a(context, true);
        int g10 = b7.g(a10, R.attr.mediaRouteTheme);
        this.O = true;
        this.E0 = new ra(this, 8);
        Context context2 = getContext();
        this.s = context2;
        this.j0 = new q(this, 0);
        this.h = s4.x.d(context2);
        this.P = s4.x.g();
        this.n = new c(this, i7);
        this.r = s4.x.f();
        p(s4.x.e());
        this.g0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.D0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.B0 = AnimationUtils.loadInterpolator(a10, R.interpolator.mr_linear_out_slow_in);
        this.C0 = AnimationUtils.loadInterpolator(a10, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void o(int i7, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i7;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i7, View view) {
        m mVar = new m(view, view.getLayoutParams().height, i7, 0);
        mVar.setDuration(this.x0);
        mVar.setInterpolator(this.A0);
        view.startAnimation(mVar);
    }

    public final boolean h() {
        return (this.l0 == null && this.k0 == null) ? false : true;
    }

    public final void i(boolean z9) {
        HashSet hashSet;
        int firstVisiblePosition = this.U.getFirstVisiblePosition();
        for (int i7 = 0; i7 < this.U.getChildCount(); i7++) {
            View childAt = this.U.getChildAt(i7);
            s4.v vVar = (s4.v) this.V.getItem(firstVisiblePosition + i7);
            if (!z9 || (hashSet = this.X) == null || !hashSet.contains(vVar)) {
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
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o0 o0Var = (o0) obj;
            o0Var.j = true;
            o0Var.k = true;
            q4.q qVar = o0Var.l;
            if (qVar != null) {
                t tVar = (t) qVar.c;
                tVar.Z.remove((s4.v) qVar.b);
                tVar.V.notifyDataSetChanged();
            }
        }
        if (z9) {
            return;
        }
        j(false);
    }

    public final void j(boolean z9) {
        this.X = null;
        this.Y = null;
        this.v0 = false;
        if (this.w0) {
            this.w0 = false;
            t(z9);
        }
        this.U.setEnabled(true);
    }

    public final int k(int i7, int i10) {
        return i7 >= i10 ? (int) (((this.y * i10) / i7) + 0.5f) : (int) a8.p0.f(this.y, 9.0f, 16.0f, 0.5f);
    }

    public final int l(boolean z9) {
        if (!z9 && this.S.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.Q.getPaddingBottom() + this.Q.getPaddingTop();
        if (z9) {
            paddingBottom += this.R.getMeasuredHeight();
        }
        if (this.S.getVisibility() == 0) {
            paddingBottom += this.S.getMeasuredHeight();
        }
        return (z9 && this.S.getVisibility() == 0) ? this.T.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        s4.v vVar = this.r;
        return vVar.e() && DesugarCollections.unmodifiableList(vVar.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        this.h.a(s4.r.c, this.n, 2);
        p(s4.x.e());
    }

    @Override // g.f, g.u, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        o oVar = new o(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.H = frameLayout;
        frameLayout.setOnClickListener(new o(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.I = linearLayout;
        linearLayout.setOnClickListener(new k());
        Context context = this.s;
        int f10 = b7.f(context, 0, R.attr.colorPrimary);
        if (i0.a.g(f10, b7.f(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            f10 = b7.f(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.D = button;
        button.setText(R.string.mr_controller_disconnect);
        this.D.setTextColor(f10);
        this.D.setOnClickListener(oVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.E = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.E.setTextColor(f10);
        this.E.setOnClickListener(oVar);
        this.N = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(oVar);
        this.J = (FrameLayout) findViewById(R.id.mr_default_control);
        o oVar2 = new o(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.K = imageView;
        imageView.setOnClickListener(oVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(oVar2);
        this.Q = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.T = findViewById(R.id.mr_control_divider);
        this.R = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.L = (TextView) findViewById(R.id.mr_control_title);
        this.M = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.F = imageButton;
        imageButton.setOnClickListener(oVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.S = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.a0 = seekBar;
        s4.v vVar = this.r;
        seekBar.setTag(vVar);
        r rVar = new r(this);
        this.b0 = rVar;
        this.a0.setOnSeekBarChangeListener(rVar);
        this.U = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.W = new ArrayList();
        s sVar = new s(this, this.U.getContext(), this.W);
        this.V = sVar;
        this.U.setAdapter((ListAdapter) sVar);
        this.Z = new HashSet();
        LinearLayout linearLayout3 = this.Q;
        OverlayListView overlayListView = this.U;
        boolean n10 = n();
        int f11 = b7.f(context, 0, R.attr.colorPrimary);
        int f12 = b7.f(context, 0, R.attr.colorPrimaryDark);
        if (n10 && b7.b(context, 0) == -570425344) {
            f12 = f11;
            f11 = -1;
        }
        linearLayout3.setBackgroundColor(f11);
        overlayListView.setBackgroundColor(f12);
        linearLayout3.setTag(Integer.valueOf(f11));
        overlayListView.setTag(Integer.valueOf(f12));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.a0;
        LinearLayout linearLayout4 = this.Q;
        int b10 = b7.b(context, 0);
        if (Color.alpha(b10) != 255) {
            b10 = i0.a.k(b10, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b10, b10);
        HashMap hashMap = new HashMap();
        this.h0 = hashMap;
        hashMap.put(vVar, this.a0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.G = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.r = new o(this, 3);
        this.A0 = this.u0 ? this.B0 : this.C0;
        this.x0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.y0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.z0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.w = true;
        s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h.h(this.n);
        p(null);
        this.x = false;
        super.onDetachedFromWindow();
    }

    @Override // g.f, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 != 25 && i7 != 24) {
            return super.onKeyDown(i7, keyEvent);
        }
        if (this.P || !this.u0) {
            this.r.k(i7 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // g.f, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (i7 == 25 || i7 == 24) {
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    public final void p(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        PlaybackStateCompat i7;
        wf.b bVar = this.i0;
        q qVar = this.j0;
        if (bVar != null) {
            bVar.k0(qVar);
            this.i0 = null;
        }
        if (mediaSessionCompat$Token != null && this.x) {
            wf.b bVar2 = new wf.b(this.s, mediaSessionCompat$Token);
            this.i0 = bVar2;
            bVar2.f0(qVar);
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
                    i7 = mediaSessionCompat$Token2.a().i();
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
                }
                this.k0 = i7;
                r();
                q(false);
            }
            PlaybackState playbackState = hVar.a.getPlaybackState();
            i7 = playbackState != null ? PlaybackStateCompat.a(playbackState) : null;
            this.k0 = i7;
            r();
            q(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        PlaybackStateCompat playbackStateCompat;
        int i7;
        int i10;
        boolean z13 = true;
        if (this.c0 != null) {
            this.s0 = true;
            this.t0 = z9 | this.t0;
            return;
        }
        this.s0 = false;
        this.t0 = false;
        s4.v vVar = this.r;
        if (!vVar.g() || vVar.d()) {
            dismiss();
            return;
        }
        if (this.w) {
            this.N.setText(vVar.d);
            this.D.setVisibility(vVar.j ? 0 : 8);
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
            boolean z14 = this.P;
            if (z14 || !n()) {
                if (!this.u0 || z14) {
                    if (this.O) {
                        if (((!vVar.e() || s4.x.g()) ? vVar.o : 0) == 1) {
                            z10 = true;
                            if (z10) {
                                if (this.S.getVisibility() == 8) {
                                    this.S.setVisibility(0);
                                    this.a0.setMax(vVar.q);
                                    this.a0.setProgress(vVar.p);
                                    this.G.setVisibility(n() ? 0 : 8);
                                }
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
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
                            z11 = false;
                        } else {
                            this.L.setText(charSequence);
                            z11 = true;
                        }
                        if (isEmpty2) {
                            z12 = false;
                        } else {
                            this.M.setText(charSequence2);
                            z12 = true;
                        }
                        this.L.setVisibility(!z11 ? 0 : 8);
                        this.M.setVisibility(!z12 ? 0 : 8);
                        playbackStateCompat = this.k0;
                        if (playbackStateCompat != null) {
                            int i11 = playbackStateCompat.a;
                            boolean z15 = i11 == 6 || i11 == 3;
                            Context context = this.F.getContext();
                            if (z15) {
                                if ((this.k0.e & 514) != 0) {
                                    i7 = R.attr.mediaRoutePauseDrawable;
                                    i10 = R.string.mr_controller_pause;
                                    this.F.setVisibility(z13 ? 0 : 8);
                                    if (z13) {
                                        this.F.setImageResource(b7.g(context, i7));
                                        this.F.setContentDescription(context.getResources().getText(i10));
                                    }
                                }
                            }
                            if (z15) {
                                if ((this.k0.e & 1) != 0) {
                                    i7 = R.attr.mediaRouteStopDrawable;
                                    i10 = R.string.mr_controller_stop;
                                    this.F.setVisibility(z13 ? 0 : 8);
                                    if (z13) {
                                    }
                                }
                            }
                            if (!z15) {
                                if ((this.k0.e & 516) != 0) {
                                    i7 = R.attr.mediaRoutePlayDrawable;
                                    i10 = R.string.mr_controller_play;
                                    this.F.setVisibility(z13 ? 0 : 8);
                                    if (z13) {
                                    }
                                }
                            }
                            z13 = false;
                            i7 = 0;
                            i10 = 0;
                            this.F.setVisibility(z13 ? 0 : 8);
                            if (z13) {
                            }
                        }
                    }
                }
                z12 = false;
                z11 = true;
                this.L.setVisibility(!z11 ? 0 : 8);
                this.M.setVisibility(!z12 ? 0 : 8);
                playbackStateCompat = this.k0;
                if (playbackStateCompat != null) {
                }
            }
            t(z9);
        }
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.l0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        p pVar = this.m0;
        Bitmap bitmap2 = pVar == null ? this.n0 : pVar.a;
        Uri uri2 = pVar == null ? this.o0 : pVar.b;
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
            p pVar2 = this.m0;
            if (pVar2 != null) {
                pVar2.cancel(true);
            }
            p pVar3 = new p(this);
            this.m0 = pVar3;
            pVar3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.s;
        int a10 = a7.a(context);
        getWindow().setLayout(a10, -2);
        View decorView = getWindow().getDecorView();
        this.y = (a10 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.d0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.e0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.n0 = null;
        this.o0 = null;
        r();
        q(false);
    }

    public final void t(boolean z9) {
        this.J.requestLayout();
        this.J.getViewTreeObserver().addOnGlobalLayoutListener(new l(this, z9));
    }

    public final void u(boolean z9) {
        int i7 = 0;
        this.T.setVisibility((this.S.getVisibility() == 0 && z9) ? 0 : 8);
        LinearLayout linearLayout = this.Q;
        if (this.S.getVisibility() == 8 && !z9) {
            i7 = 8;
        }
        linearLayout.setVisibility(i7);
    }
}
