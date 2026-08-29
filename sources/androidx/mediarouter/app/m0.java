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
import h7.e5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m0 extends g.s {
    public static final /* synthetic */ int f0 = 0;
    public boolean A;
    public boolean B;
    public long C;
    public final a4.d D;
    public RecyclerView E;
    public k0 F;
    public l0 G;
    public HashMap H;
    public c2.b0 I;
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
    public final p W;
    public MediaDescriptionCompat X;
    public d0 Y;
    public Bitmap Z;
    public Uri a0;
    public boolean b0;
    public Bitmap c0;
    public int d0;
    public final boolean e0;
    public final c2.d0 f;
    public final c h;
    public c2.w n;
    public c2.b0 r;
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
    public m0(Context context) {
        super(r2, r0 == 0 ? e5.e(r2) : r0);
        ContextThemeWrapper a2 = e5.a(context, false);
        int g10 = e5.g(a2, R.attr.mediaRouteTheme);
        this.n = c2.w.c;
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        int i10 = 3;
        this.D = new a4.d(this, i10);
        Context context2 = getContext();
        this.y = context2;
        this.f = c2.d0.d(context2);
        this.e0 = c2.d0.g();
        this.h = new c(this, i10);
        this.r = c2.d0.f();
        this.W = new p(this, 1);
        h(c2.d0.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            c2.b0 b0Var = (c2.b0) list.get(size);
            if (b0Var.d() || !b0Var.g || !b0Var.h(this.n) || this.r == b0Var) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.X;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        d0 d0Var = this.Y;
        Bitmap bitmap2 = d0Var == null ? this.Z : d0Var.a;
        Uri uri2 = d0Var == null ? this.a0 : d0Var.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            d0 d0Var2 = this.Y;
            if (d0Var2 != null) {
                d0Var2.cancel(true);
            }
            d0 d0Var3 = new d0(this);
            this.Y = d0Var3;
            d0Var3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        android.support.v4.media.session.p pVar = this.V;
        p pVar2 = this.W;
        if (pVar != null) {
            pVar.e(pVar2);
            this.V = null;
        }
        if (mediaSessionCompat$Token != null && this.B) {
            android.support.v4.media.session.p pVar3 = new android.support.v4.media.session.p(this.y, mediaSessionCompat$Token);
            this.V = pVar3;
            pVar3.d(pVar2);
            MediaMetadataCompat a2 = this.V.a();
            this.X = a2 != null ? a2.a() : null;
            f();
            k();
        }
    }

    public final void i(c2.w wVar) {
        if (wVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(wVar)) {
            return;
        }
        this.n = wVar;
        if (this.B) {
            c2.d0 d0Var = this.f;
            c cVar = this.h;
            d0Var.h(cVar);
            d0Var.a(wVar, cVar, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.y;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : h7.k0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
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
        c2.a0 a0Var = this.r.a;
        a0Var.getClass();
        c2.d0.b();
        for (c2.b0 b0Var : DesugarCollections.unmodifiableList(a0Var.b)) {
            za.c b10 = this.r.b(b0Var);
            if (b10 != null) {
                c2.q qVar = (c2.q) b10.b;
                if (qVar != null && qVar.d) {
                    arrayList2.add(b0Var);
                }
                if (qVar != null && qVar.e) {
                    arrayList3.add(b0Var);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        e eVar = e.d;
        Collections.sort(arrayList, eVar);
        Collections.sort(arrayList2, eVar);
        Collections.sort(arrayList3, eVar);
        this.F.G();
    }

    public final void n() {
        if (this.B) {
            if (SystemClock.uptimeMillis() - this.C < 300) {
                a4.d dVar = this.D;
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
        h(c2.d0.e());
    }

    @Override // g.s, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.y;
        decorView.setBackgroundColor(f0.e.c(context, e5.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.N = imageButton;
        imageButton.setColorFilter(-1);
        this.N.setOnClickListener(new c0(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.O = button;
        button.setTextColor(-1);
        this.O.setOnClickListener(new c0(this, 1));
        this.F = new k0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.E = recyclerView;
        recyclerView.setAdapter(this.F);
        this.E.setLayoutManager(new f2.j0());
        this.G = new l0(this);
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
