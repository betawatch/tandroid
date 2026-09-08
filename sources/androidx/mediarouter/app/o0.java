package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class o0 extends g.u {
    public static final /* synthetic */ int j0 = 0;
    public boolean E;
    public boolean F;
    public long G;
    public final c H;
    public RecyclerView I;
    public m0 J;
    public n0 K;
    public HashMap L;
    public p4.v M;
    public HashMap N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public ImageButton R;
    public Button S;
    public ImageView T;
    public View U;
    public ImageView V;
    public TextView W;
    public TextView X;
    public String Y;
    public pf.b Z;
    public final r a0;
    public MediaDescriptionCompat b0;
    public f0 c0;
    public Bitmap d0;
    public Uri e0;
    public final p4.x f;
    public boolean f0;
    public Bitmap g0;
    public final d h;
    public int h0;
    public final boolean i0;
    public p4.r n;
    public p4.v r;
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
    public o0(Context context) {
        super(r2, r0 == 0 ? v7.d0.e(r2) : r0);
        ContextThemeWrapper a2 = v7.d0.a(context, false);
        int g10 = v7.d0.g(a2, R.attr.mediaRouteTheme);
        this.n = p4.r.c;
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.H = new c(this, 2);
        Context context2 = getContext();
        this.y = context2;
        this.f = p4.x.d(context2);
        this.i0 = p4.x.g();
        this.h = new d(this, 3);
        this.r = p4.x.f();
        this.a0 = new r(this, 1);
        h(p4.x.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            p4.v vVar = (p4.v) list.get(size);
            if (vVar.d() || !vVar.g || !vVar.h(this.n) || this.r == vVar) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.b0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        f0 f0Var = this.c0;
        Bitmap bitmap2 = f0Var == null ? this.d0 : f0Var.a;
        Uri uri2 = f0Var == null ? this.e0 : f0Var.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            f0 f0Var2 = this.c0;
            if (f0Var2 != null) {
                f0Var2.cancel(true);
            }
            f0 f0Var3 = new f0(this);
            this.c0 = f0Var3;
            f0Var3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        pf.b bVar = this.Z;
        r rVar = this.a0;
        if (bVar != null) {
            bVar.k0(rVar);
            this.Z = null;
        }
        if (mediaSessionCompat$Token != null && this.F) {
            pf.b bVar2 = new pf.b(this.y, mediaSessionCompat$Token);
            this.Z = bVar2;
            bVar2.f0(rVar);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.Z.b).a.getMetadata();
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
            this.b0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
            f();
            k();
        }
    }

    public final void i(p4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(rVar)) {
            return;
        }
        this.n = rVar;
        if (this.F) {
            p4.x xVar = this.f;
            d dVar = this.h;
            xVar.h(dVar);
            xVar.a(rVar, dVar, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.y;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : v7.c0.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.d0 = null;
        this.e0 = null;
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
        if ((this.M != null || this.O) ? true : !this.E) {
            this.Q = true;
            return;
        }
        this.Q = false;
        if (!this.r.g() || this.r.d()) {
            dismiss();
        }
        if (this.f0) {
            Bitmap bitmap = this.g0;
            if (!(bitmap != null && bitmap.isRecycled()) && this.g0 != null) {
                this.V.setVisibility(0);
                this.V.setImageBitmap(this.g0);
                this.V.setBackgroundColor(this.h0);
                this.U.setVisibility(0);
                Bitmap bitmap2 = this.g0;
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
                this.T.setImageBitmap(copy);
                this.f0 = false;
                this.g0 = null;
                this.h0 = 0;
                MediaDescriptionCompat mediaDescriptionCompat = this.b0;
                CharSequence charSequence = mediaDescriptionCompat != null ? null : mediaDescriptionCompat.b;
                isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.b0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (isEmpty) {
                    this.W.setText(charSequence);
                } else {
                    this.W.setText(this.Y);
                }
                if (!isEmpty2) {
                    this.X.setVisibility(8);
                    return;
                } else {
                    this.X.setText(charSequence2);
                    this.X.setVisibility(0);
                    return;
                }
            }
        }
        Bitmap bitmap3 = this.g0;
        if (bitmap3 != null && bitmap3.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.g0);
        }
        this.V.setVisibility(8);
        this.U.setVisibility(8);
        this.T.setImageBitmap(null);
        this.f0 = false;
        this.g0 = null;
        this.h0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat3 = this.b0;
        if (mediaDescriptionCompat3 != null) {
        }
        isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat22 = this.b0;
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
        p4.u uVar = this.r.a;
        uVar.getClass();
        p4.x.b();
        for (p4.v vVar : DesugarCollections.unmodifiableList(uVar.b)) {
            mg.n b10 = this.r.b(vVar);
            if (b10 != null) {
                p4.o oVar = (p4.o) b10.b;
                if (oVar != null && oVar.d) {
                    arrayList2.add(vVar);
                }
                if (oVar != null && oVar.e) {
                    arrayList3.add(vVar);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        f fVar = f.d;
        Collections.sort(arrayList, fVar);
        Collections.sort(arrayList2, fVar);
        Collections.sort(arrayList3, fVar);
        this.J.G();
    }

    public final void n() {
        if (this.F) {
            if (SystemClock.uptimeMillis() - this.G < 300) {
                c cVar = this.H;
                cVar.removeMessages(1);
                cVar.sendEmptyMessageAtTime(1, this.G + 300);
                return;
            }
            if ((this.M != null || this.O) ? true : !this.E) {
                this.P = true;
                return;
            }
            this.P = false;
            if (!this.r.g() || this.r.d()) {
                dismiss();
            }
            this.G = SystemClock.uptimeMillis();
            this.J.F();
        }
    }

    public final void o() {
        if (this.P) {
            n();
        }
        if (this.Q) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        this.f.a(this.n, this.h, 1);
        l();
        h(p4.x.e());
    }

    @Override // g.u, androidx.activity.n, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.y;
        decorView.setBackgroundColor(f0.e.c(context, v7.d0.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.R = imageButton;
        imageButton.setColorFilter(-1);
        this.R.setOnClickListener(new e0(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.S = button;
        button.setTextColor(-1);
        this.S.setOnClickListener(new e0(this, 1));
        this.J = new m0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.I = recyclerView;
        recyclerView.setAdapter(this.J);
        this.I.setLayoutManager(new s4.c0());
        this.K = new n0(this);
        this.L = new HashMap();
        this.N = new HashMap();
        this.T = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.U = findViewById(R.id.mr_cast_meta_black_scrim);
        this.V = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.W = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.X = textView2;
        textView2.setTextColor(-1);
        this.Y = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.E = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        this.f.h(this.h);
        this.H.removeCallbacksAndMessages(null);
        h(null);
    }
}
