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
import b8.c1;
import b8.d1;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class t extends g.f {
    public static final int G0;
    public int A0;
    public Interpolator B0;
    public final Interpolator C0;
    public final Interpolator D0;
    public Button E;
    public final AccessibilityManager E0;
    public Button F;
    public final a3.o F0;
    public ImageButton G;
    public MediaRouteExpandCollapseButton H;
    public FrameLayout I;
    public LinearLayout J;
    public FrameLayout K;
    public ImageView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public final boolean P;
    public final boolean Q;
    public LinearLayout R;
    public RelativeLayout S;
    public LinearLayout T;
    public View U;
    public OverlayListView V;
    public s W;
    public ArrayList X;
    public HashSet Y;
    public HashSet Z;
    public HashSet a0;
    public SeekBar b0;
    public r c0;
    public r4.w d0;
    public int e0;
    public int f0;
    public int g0;
    public final r4.y h;
    public final int h0;
    public HashMap i0;
    public p4.q j0;
    public final q k0;
    public PlaybackStateCompat l0;
    public MediaDescriptionCompat m0;
    public final c n;
    public p n0;
    public Bitmap o0;
    public Uri p0;
    public boolean q0;
    public final r4.w r;
    public Bitmap r0;
    public final Context s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public int y;
    public int y0;
    public int z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        G0 = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t(Context context) {
        super(r5, r1 == 0 ? d1.e(r5) : r1);
        int i3 = 1;
        ContextThemeWrapper a10 = d1.a(context, true);
        int g7 = d1.g(a10, R.attr.mediaRouteTheme);
        this.P = true;
        this.F0 = new a3.o(this, 7);
        Context context2 = getContext();
        this.s = context2;
        this.k0 = new q(this, 0);
        this.h = r4.y.d(context2);
        this.Q = r4.y.g();
        this.n = new c(this, i3);
        this.r = r4.y.f();
        p(r4.y.e());
        this.h0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.E0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.C0 = AnimationUtils.loadInterpolator(a10, R.interpolator.mr_linear_out_slow_in);
        this.D0 = AnimationUtils.loadInterpolator(a10, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void o(int i3, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i3, View view) {
        m mVar = new m(view, view.getLayoutParams().height, i3, 0);
        mVar.setDuration(this.y0);
        mVar.setInterpolator(this.B0);
        view.startAnimation(mVar);
    }

    public final boolean h() {
        return (this.m0 == null && this.l0 == null) ? false : true;
    }

    public final void i(boolean z10) {
        HashSet hashSet;
        int firstVisiblePosition = this.V.getFirstVisiblePosition();
        for (int i3 = 0; i3 < this.V.getChildCount(); i3++) {
            View childAt = this.V.getChildAt(i3);
            r4.w wVar = (r4.w) this.W.getItem(firstVisiblePosition + i3);
            if (!z10 || (hashSet = this.Y) == null || !hashSet.contains(wVar)) {
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
        ArrayList arrayList = this.V.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            p0 p0Var = (p0) obj;
            p0Var.j = true;
            p0Var.k = true;
            tf.b bVar = p0Var.l;
            if (bVar != null) {
                t tVar = (t) bVar.b;
                tVar.a0.remove((r4.w) bVar.a);
                tVar.W.notifyDataSetChanged();
            }
        }
        if (z10) {
            return;
        }
        j(false);
    }

    public final void j(boolean z10) {
        this.Y = null;
        this.Z = null;
        this.w0 = false;
        if (this.x0) {
            this.x0 = false;
            t(z10);
        }
        this.V.setEnabled(true);
    }

    public final int k(int i3, int i10) {
        return i3 >= i10 ? (int) (((this.y * i10) / i3) + 0.5f) : (int) a1.g.e(this.y, 9.0f, 16.0f, 0.5f);
    }

    public final int l(boolean z10) {
        if (!z10 && this.T.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.R.getPaddingBottom() + this.R.getPaddingTop();
        if (z10) {
            paddingBottom += this.S.getMeasuredHeight();
        }
        if (this.T.getVisibility() == 0) {
            paddingBottom += this.T.getMeasuredHeight();
        }
        return (z10 && this.T.getVisibility() == 0) ? this.U.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        r4.w wVar = this.r;
        return wVar.e() && DesugarCollections.unmodifiableList(wVar.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        this.h.a(r4.r.c, this.n, 2);
        p(r4.y.e());
    }

    @Override // g.f, g.u, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        o oVar = new o(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.I = frameLayout;
        frameLayout.setOnClickListener(new o(this, 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.J = linearLayout;
        linearLayout.setOnClickListener(new k());
        Context context = this.s;
        int f10 = d1.f(context, 0, R.attr.colorPrimary);
        if (i0.a.g(f10, d1.f(context, 0, android.R.attr.colorBackground)) < 3.0d) {
            f10 = d1.f(context, 0, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.E = button;
        button.setText(R.string.mr_controller_disconnect);
        this.E.setTextColor(f10);
        this.E.setOnClickListener(oVar);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.F = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.F.setTextColor(f10);
        this.F.setOnClickListener(oVar);
        this.O = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(oVar);
        this.K = (FrameLayout) findViewById(R.id.mr_default_control);
        o oVar2 = new o(this, 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.L = imageView;
        imageView.setOnClickListener(oVar2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(oVar2);
        this.R = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.U = findViewById(R.id.mr_control_divider);
        this.S = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.M = (TextView) findViewById(R.id.mr_control_title);
        this.N = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.G = imageButton;
        imageButton.setOnClickListener(oVar);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.T = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.b0 = seekBar;
        r4.w wVar = this.r;
        seekBar.setTag(wVar);
        r rVar = new r(this);
        this.c0 = rVar;
        this.b0.setOnSeekBarChangeListener(rVar);
        this.V = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.X = new ArrayList();
        s sVar = new s(this, this.V.getContext(), this.X);
        this.W = sVar;
        this.V.setAdapter((ListAdapter) sVar);
        this.a0 = new HashSet();
        LinearLayout linearLayout3 = this.R;
        OverlayListView overlayListView = this.V;
        boolean n4 = n();
        int f11 = d1.f(context, 0, R.attr.colorPrimary);
        int f12 = d1.f(context, 0, R.attr.colorPrimaryDark);
        if (n4 && d1.b(context, 0) == -570425344) {
            f12 = f11;
            f11 = -1;
        }
        linearLayout3.setBackgroundColor(f11);
        overlayListView.setBackgroundColor(f12);
        linearLayout3.setTag(Integer.valueOf(f11));
        overlayListView.setTag(Integer.valueOf(f12));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.b0;
        LinearLayout linearLayout4 = this.R;
        int b10 = d1.b(context, 0);
        if (Color.alpha(b10) != 255) {
            b10 = i0.a.k(b10, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b10, b10);
        HashMap hashMap = new HashMap();
        this.i0 = hashMap;
        hashMap.put(wVar, this.b0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.H = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.r = new o(this, 3);
        this.B0 = this.v0 ? this.C0 : this.D0;
        this.y0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.z0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.A0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
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
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 != 25 && i3 != 24) {
            return super.onKeyDown(i3, keyEvent);
        }
        if (this.Q || !this.v0) {
            this.r.k(i3 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // g.f, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (i3 == 25 || i3 == 24) {
            return true;
        }
        return super.onKeyUp(i3, keyEvent);
    }

    public final void p(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        PlaybackStateCompat h;
        p4.q qVar = this.j0;
        q qVar2 = this.k0;
        if (qVar != null) {
            qVar.H(qVar2);
            this.j0 = null;
        }
        if (mediaSessionCompat$Token != null && this.x) {
            p4.q qVar3 = new p4.q(this.s, mediaSessionCompat$Token);
            this.j0 = qVar3;
            qVar3.C(qVar2);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.j0.a).a.getMetadata();
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
            this.m0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.j0.a;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = hVar.e;
            if (mediaSessionCompat$Token2.a() != null) {
                try {
                    h = mediaSessionCompat$Token2.a().h();
                } catch (RemoteException e10) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e10);
                }
                this.l0 = h;
                r();
                q(false);
            }
            PlaybackState playbackState = hVar.a.getPlaybackState();
            h = playbackState != null ? PlaybackStateCompat.a(playbackState) : null;
            this.l0 = h;
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
    public final void q(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        PlaybackStateCompat playbackStateCompat;
        int i3;
        int i10;
        boolean z14 = true;
        if (this.d0 != null) {
            this.t0 = true;
            this.u0 = z10 | this.u0;
            return;
        }
        this.t0 = false;
        this.u0 = false;
        r4.w wVar = this.r;
        if (!wVar.g() || wVar.d()) {
            dismiss();
            return;
        }
        if (this.w) {
            this.O.setText(wVar.d);
            this.E.setVisibility(wVar.j ? 0 : 8);
            if (this.q0) {
                Bitmap bitmap = this.r0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.L.setImageBitmap(this.r0);
                    this.L.setBackgroundColor(this.s0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.r0);
                }
                this.q0 = false;
                this.r0 = null;
                this.s0 = 0;
            }
            boolean z15 = this.Q;
            if (z15 || !n()) {
                if (!this.v0 || z15) {
                    if (this.P) {
                        if (((!wVar.e() || r4.y.g()) ? wVar.o : 0) == 1) {
                            z11 = true;
                            if (z11) {
                                if (this.T.getVisibility() == 8) {
                                    this.T.setVisibility(0);
                                    this.b0.setMax(wVar.q);
                                    this.b0.setProgress(wVar.p);
                                    this.H.setVisibility(n() ? 0 : 8);
                                }
                            }
                        }
                    }
                    z11 = false;
                    if (z11) {
                    }
                }
                this.T.setVisibility(8);
            } else {
                this.T.setVisibility(8);
                this.v0 = true;
                this.V.setVisibility(0);
                this.B0 = this.v0 ? this.C0 : this.D0;
                t(false);
            }
            if (h()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.m0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.m0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (wVar.r != -1) {
                    this.M.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.l0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.M.setText(R.string.mr_controller_no_media_selected);
                    } else if (isEmpty && isEmpty2) {
                        this.M.setText(R.string.mr_controller_no_info_available);
                    } else {
                        if (isEmpty) {
                            z12 = false;
                        } else {
                            this.M.setText(charSequence);
                            z12 = true;
                        }
                        if (isEmpty2) {
                            z13 = false;
                        } else {
                            this.N.setText(charSequence2);
                            z13 = true;
                        }
                        this.M.setVisibility(!z12 ? 0 : 8);
                        this.N.setVisibility(!z13 ? 0 : 8);
                        playbackStateCompat = this.l0;
                        if (playbackStateCompat != null) {
                            int i11 = playbackStateCompat.a;
                            boolean z16 = i11 == 6 || i11 == 3;
                            Context context = this.G.getContext();
                            if (z16) {
                                if ((this.l0.e & 514) != 0) {
                                    i3 = R.attr.mediaRoutePauseDrawable;
                                    i10 = R.string.mr_controller_pause;
                                    this.G.setVisibility(z14 ? 0 : 8);
                                    if (z14) {
                                        this.G.setImageResource(d1.g(context, i3));
                                        this.G.setContentDescription(context.getResources().getText(i10));
                                    }
                                }
                            }
                            if (z16) {
                                if ((this.l0.e & 1) != 0) {
                                    i3 = R.attr.mediaRouteStopDrawable;
                                    i10 = R.string.mr_controller_stop;
                                    this.G.setVisibility(z14 ? 0 : 8);
                                    if (z14) {
                                    }
                                }
                            }
                            if (!z16) {
                                if ((this.l0.e & 516) != 0) {
                                    i3 = R.attr.mediaRoutePlayDrawable;
                                    i10 = R.string.mr_controller_play;
                                    this.G.setVisibility(z14 ? 0 : 8);
                                    if (z14) {
                                    }
                                }
                            }
                            z14 = false;
                            i3 = 0;
                            i10 = 0;
                            this.G.setVisibility(z14 ? 0 : 8);
                            if (z14) {
                            }
                        }
                    }
                }
                z13 = false;
                z12 = true;
                this.M.setVisibility(!z12 ? 0 : 8);
                this.N.setVisibility(!z13 ? 0 : 8);
                playbackStateCompat = this.l0;
                if (playbackStateCompat != null) {
                }
            }
            t(z10);
        }
    }

    public final void r() {
        MediaDescriptionCompat mediaDescriptionCompat = this.m0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        p pVar = this.n0;
        Bitmap bitmap2 = pVar == null ? this.o0 : pVar.a;
        Uri uri2 = pVar == null ? this.p0 : pVar.b;
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
        if (!n() || this.Q) {
            p pVar2 = this.n0;
            if (pVar2 != null) {
                pVar2.cancel(true);
            }
            p pVar3 = new p(this);
            this.n0 = pVar3;
            pVar3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.s;
        int a10 = c1.a(context);
        getWindow().setLayout(a10, -2);
        View decorView = getWindow().getDecorView();
        this.y = (a10 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.e0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.g0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.o0 = null;
        this.p0 = null;
        r();
        q(false);
    }

    public final void t(boolean z10) {
        this.K.requestLayout();
        this.K.getViewTreeObserver().addOnGlobalLayoutListener(new l(this, z10));
    }

    public final void u(boolean z10) {
        int i3 = 0;
        this.U.setVisibility((this.T.getVisibility() == 0 && z10) ? 0 : 8);
        LinearLayout linearLayout = this.R;
        if (this.T.getVisibility() == 8 && !z10) {
            i3 = 8;
        }
        linearLayout.setVisibility(i3);
    }
}
