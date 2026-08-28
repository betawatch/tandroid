package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 extends g.s {
    public static final /* synthetic */ int f0 = 0;
    public boolean A;
    public boolean B;
    public long C;
    public final d D;
    public RecyclerView E;
    public n0 F;
    public o0 G;
    public HashMap H;
    public c2.a0 I;
    public HashMap J;
    public boolean K;
    public boolean L;
    public boolean M;
    public ImageButton N;
    public Button O;
    public ImageView P;
    public View Q;
    public ImageView R;
    public TextView S;
    public TextView T;
    public String U;
    public android.support.v4.media.session.p V;
    public final s W;
    public MediaDescriptionCompat X;
    public g0 Y;
    public Bitmap Z;
    public Uri a0;
    public boolean b0;
    public Bitmap c0;
    public int d0;
    public final boolean e0;
    public final c2.c0 f;
    public final e h;
    public c2.v n;
    public c2.a0 r;
    public final ArrayList s;
    public final ArrayList v;
    public final ArrayList w;
    public final ArrayList x;
    public final Context y;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p0(Context context) {
        super(r2, r0 == 0 ? f7.d0.e(r2) : r0);
        ContextThemeWrapper a2 = f7.d0.a(context, false);
        int g10 = f7.d0.g(a2, R.attr.mediaRouteTheme);
        this.n = c2.v.c;
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.D = new d(this, 2);
        Context context2 = getContext();
        this.y = context2;
        this.f = c2.c0.d(context2);
        this.e0 = c2.c0.g();
        this.h = new e(this, 3);
        this.r = c2.c0.f();
        this.W = new s(this, 1);
        h(c2.c0.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            c2.a0 a0Var = (c2.a0) list.get(size);
            if (a0Var.d() || !a0Var.g || !a0Var.h(this.n) || this.r == a0Var) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.X;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        g0 g0Var = this.Y;
        Bitmap bitmap2 = g0Var == null ? this.Z : g0Var.a;
        Uri uri2 = g0Var == null ? this.a0 : g0Var.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            g0 g0Var2 = this.Y;
            if (g0Var2 != null) {
                g0Var2.cancel(true);
            }
            g0 g0Var3 = new g0(this);
            this.Y = g0Var3;
            g0Var3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        android.support.v4.media.session.p pVar = this.V;
        s sVar = this.W;
        if (pVar != null) {
            pVar.e(sVar);
            this.V = null;
        }
        if (mediaSessionCompat$Token != null && this.B) {
            android.support.v4.media.session.p pVar2 = new android.support.v4.media.session.p(this.y, mediaSessionCompat$Token);
            this.V = pVar2;
            pVar2.d(sVar);
            MediaMetadataCompat a2 = this.V.a();
            this.X = a2 != null ? a2.a() : null;
            f();
            k();
        }
    }

    public final void i(c2.v vVar) {
        if (vVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(vVar)) {
            return;
        }
        this.n = vVar;
        if (this.B) {
            c2.c0 c0Var = this.f;
            e eVar = this.h;
            c0Var.h(eVar);
            c0Var.a(vVar, eVar, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.y;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : f7.c0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.Z = null;
        this.a0 = null;
        f();
        k();
        n();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k() {
        boolean isEmpty;
        boolean isEmpty2;
        if ((this.I != null || this.K) ? true : !this.A) {
            this.M = true;
            return;
        }
        this.M = false;
        if (!this.r.g() || this.r.d()) {
            dismiss();
        }
        if (this.b0) {
            Bitmap bitmap = this.c0;
            if (!(bitmap != null && bitmap.isRecycled()) && this.c0 != null) {
                this.R.setVisibility(0);
                this.R.setImageBitmap(this.c0);
                this.R.setBackgroundColor(this.d0);
                this.Q.setVisibility(0);
                Bitmap bitmap2 = this.c0;
                RenderScript create = RenderScript.create(this.y);
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
                Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(10.0f);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                Bitmap copy = bitmap2.copy(bitmap2.getConfig(), true);
                createTyped.copyTo(copy);
                createFromBitmap.destroy();
                createTyped.destroy();
                create2.destroy();
                create.destroy();
                this.P.setImageBitmap(copy);
                this.b0 = false;
                this.c0 = null;
                this.d0 = 0;
                MediaDescriptionCompat mediaDescriptionCompat = this.X;
                CharSequence charSequence = mediaDescriptionCompat != null ? null : mediaDescriptionCompat.b;
                isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.X;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (isEmpty) {
                    this.S.setText(charSequence);
                } else {
                    this.S.setText(this.U);
                }
                if (!isEmpty2) {
                    this.T.setVisibility(8);
                    return;
                } else {
                    this.T.setText(charSequence2);
                    this.T.setVisibility(0);
                    return;
                }
            }
        }
        Bitmap bitmap3 = this.c0;
        if (bitmap3 != null && bitmap3.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.c0);
        }
        this.R.setVisibility(8);
        this.Q.setVisibility(8);
        this.P.setImageBitmap(null);
        this.b0 = false;
        this.c0 = null;
        this.d0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat3 = this.X;
        if (mediaDescriptionCompat3 != null) {
        }
        isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat22 = this.X;
        if (mediaDescriptionCompat22 != null) {
        }
        isEmpty2 = TextUtils.isEmpty(charSequence2);
        if (isEmpty) {
        }
        if (!isEmpty2) {
        }
    }

    public final void l() {
        ArrayList arrayList = this.s;
        arrayList.clear();
        ArrayList arrayList2 = this.v;
        arrayList2.clear();
        ArrayList arrayList3 = this.w;
        arrayList3.clear();
        arrayList.addAll(DesugarCollections.unmodifiableList(this.r.v));
        c2.z zVar = this.r.a;
        zVar.getClass();
        c2.c0.b();
        for (c2.a0 a0Var : DesugarCollections.unmodifiableList(zVar.b)) {
            fa.c b10 = this.r.b(a0Var);
            if (b10 != null) {
                c2.p pVar = (c2.p) b10.b;
                if (pVar != null && pVar.d) {
                    arrayList2.add(a0Var);
                }
                if (pVar != null && pVar.e) {
                    arrayList3.add(a0Var);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        g gVar = g.d;
        Collections.sort(arrayList, gVar);
        Collections.sort(arrayList2, gVar);
        Collections.sort(arrayList3, gVar);
        this.F.G();
    }

    public final void n() {
        if (this.B) {
            if (SystemClock.uptimeMillis() - this.C < 300) {
                d dVar = this.D;
                dVar.removeMessages(1);
                dVar.sendEmptyMessageAtTime(1, this.C + 300);
                return;
            }
            if ((this.I != null || this.K) ? true : !this.A) {
                this.L = true;
                return;
            }
            this.L = false;
            if (!this.r.g() || this.r.d()) {
                dismiss();
            }
            this.C = SystemClock.uptimeMillis();
            this.F.F();
        }
    }

    public final void o() {
        if (this.L) {
            n();
        }
        if (this.M) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = true;
        this.f.a(this.n, this.h, 1);
        l();
        h(c2.c0.e());
    }

    @Override // g.s, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.y;
        decorView.setBackgroundColor(f0.e.c(context, f7.d0.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.N = imageButton;
        imageButton.setColorFilter(-1);
        this.N.setOnClickListener(new f0(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.O = button;
        button.setTextColor(-1);
        this.O.setOnClickListener(new f0(this, 1));
        this.F = new n0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.E = recyclerView;
        recyclerView.setAdapter(this.F);
        this.E.setLayoutManager(new f2.m0());
        this.G = new o0(this);
        this.H = new HashMap();
        this.J = new HashMap();
        this.P = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.Q = findViewById(R.id.mr_cast_meta_black_scrim);
        this.R = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.S = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.T = textView2;
        textView2.setTextColor(-1);
        this.U = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.A = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B = false;
        this.f.h(this.h);
        this.D.removeCallbacksAndMessages(null);
        h(null);
    }
}
