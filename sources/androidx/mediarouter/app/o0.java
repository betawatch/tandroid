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
import b8.c1;
import b8.d1;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o0 extends g.u {
    public static final /* synthetic */ int k0 = 0;
    public final Context E;
    public boolean F;
    public boolean G;
    public long H;
    public final android.support.v4.media.session.q I;
    public RecyclerView J;
    public m0 K;
    public n0 L;
    public HashMap M;
    public r4.w N;
    public HashMap O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ImageButton S;
    public Button T;
    public ImageView U;
    public View V;
    public ImageView W;
    public TextView X;
    public TextView Y;
    public String Z;
    public p4.q a0;
    public final q b0;
    public MediaDescriptionCompat c0;
    public e0 d0;
    public Bitmap e0;
    public final r4.y f;
    public Uri f0;
    public boolean g0;
    public final c h;
    public Bitmap h0;
    public int i0;
    public final boolean j0;
    public r4.r n;
    public r4.w r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o0(Context context) {
        super(r2, r0 == 0 ? d1.e(r2) : r0);
        ContextThemeWrapper a10 = d1.a(context, false);
        int g7 = d1.g(a10, R.attr.mediaRouteTheme);
        this.n = r4.r.c;
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        int i3 = 3;
        this.I = new android.support.v4.media.session.q(this, i3);
        Context context2 = getContext();
        this.E = context2;
        this.f = r4.y.d(context2);
        this.j0 = r4.y.g();
        this.h = new c(this, i3);
        this.r = r4.y.f();
        this.b0 = new q(this, 1);
        h(r4.y.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            r4.w wVar = (r4.w) list.get(size);
            if (wVar.d() || !wVar.g || !wVar.h(this.n) || this.r == wVar) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        e0 e0Var = this.d0;
        Bitmap bitmap2 = e0Var == null ? this.e0 : e0Var.a;
        Uri uri2 = e0Var == null ? this.f0 : e0Var.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            e0 e0Var2 = this.d0;
            if (e0Var2 != null) {
                e0Var2.cancel(true);
            }
            e0 e0Var3 = new e0(this);
            this.d0 = e0Var3;
            e0Var3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        p4.q qVar = this.a0;
        q qVar2 = this.b0;
        if (qVar != null) {
            qVar.H(qVar2);
            this.a0 = null;
        }
        if (mediaSessionCompat$Token != null && this.G) {
            p4.q qVar3 = new p4.q(this.E, mediaSessionCompat$Token);
            this.a0 = qVar3;
            qVar3.C(qVar2);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.a0.a).a.getMetadata();
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
            this.c0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
            f();
            k();
        }
    }

    public final void i(r4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(rVar)) {
            return;
        }
        this.n = rVar;
        if (this.G) {
            r4.y yVar = this.f;
            c cVar = this.h;
            yVar.h(cVar);
            yVar.a(rVar, cVar, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.E;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : c1.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.e0 = null;
        this.f0 = null;
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
        if ((this.N != null || this.P) ? true : !this.F) {
            this.R = true;
            return;
        }
        this.R = false;
        if (!this.r.g() || this.r.d()) {
            dismiss();
        }
        if (this.g0) {
            Bitmap bitmap = this.h0;
            if (!(bitmap != null && bitmap.isRecycled()) && this.h0 != null) {
                this.W.setVisibility(0);
                this.W.setImageBitmap(this.h0);
                this.W.setBackgroundColor(this.i0);
                this.V.setVisibility(0);
                Bitmap bitmap2 = this.h0;
                RenderScript create = RenderScript.create(this.E);
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
                this.U.setImageBitmap(copy);
                this.g0 = false;
                this.h0 = null;
                this.i0 = 0;
                MediaDescriptionCompat mediaDescriptionCompat = this.c0;
                CharSequence charSequence = mediaDescriptionCompat != null ? null : mediaDescriptionCompat.b;
                isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.c0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (isEmpty) {
                    this.X.setText(charSequence);
                } else {
                    this.X.setText(this.Z);
                }
                if (!isEmpty2) {
                    this.Y.setVisibility(8);
                    return;
                } else {
                    this.Y.setText(charSequence2);
                    this.Y.setVisibility(0);
                    return;
                }
            }
        }
        Bitmap bitmap3 = this.h0;
        if (bitmap3 != null && bitmap3.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.h0);
        }
        this.W.setVisibility(8);
        this.V.setVisibility(8);
        this.U.setImageBitmap(null);
        this.g0 = false;
        this.h0 = null;
        this.i0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat3 = this.c0;
        if (mediaDescriptionCompat3 != null) {
        }
        isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat22 = this.c0;
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
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        arrayList3.clear();
        arrayList.addAll(DesugarCollections.unmodifiableList(this.r.v));
        r4.v vVar = this.r.a;
        vVar.getClass();
        r4.y.b();
        for (r4.w wVar : DesugarCollections.unmodifiableList(vVar.b)) {
            y00 b10 = this.r.b(wVar);
            if (b10 != null) {
                r4.o oVar = (r4.o) b10.a;
                if (oVar != null && oVar.d) {
                    arrayList2.add(wVar);
                }
                if (oVar != null && oVar.e) {
                    arrayList3.add(wVar);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        e eVar = e.d;
        Collections.sort(arrayList, eVar);
        Collections.sort(arrayList2, eVar);
        Collections.sort(arrayList3, eVar);
        this.K.G();
    }

    public final void n() {
        if (this.G) {
            if (SystemClock.uptimeMillis() - this.H < 300) {
                android.support.v4.media.session.q qVar = this.I;
                qVar.removeMessages(1);
                qVar.sendEmptyMessageAtTime(1, this.H + 300);
                return;
            }
            if ((this.N != null || this.P) ? true : !this.F) {
                this.Q = true;
                return;
            }
            this.Q = false;
            if (!this.r.g() || this.r.d()) {
                dismiss();
            }
            this.H = SystemClock.uptimeMillis();
            this.K.F();
        }
    }

    public final void o() {
        if (this.Q) {
            n();
        }
        if (this.R) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        this.f.a(this.n, this.h, 1);
        l();
        h(r4.y.e());
    }

    @Override // g.u, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.E;
        decorView.setBackgroundColor(context.getColor(d1.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.S = imageButton;
        imageButton.setColorFilter(-1);
        this.S.setOnClickListener(new d0(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.T = button;
        button.setTextColor(-1);
        this.T.setOnClickListener(new d0(this, 1));
        this.K = new m0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.J = recyclerView;
        recyclerView.setAdapter(this.K);
        this.J.setLayoutManager(new u4.b0());
        this.L = new n0(this);
        this.M = new HashMap();
        this.O = new HashMap();
        this.U = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.V = findViewById(R.id.mr_cast_meta_black_scrim);
        this.W = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.X = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.Y = textView2;
        textView2.setTextColor(-1);
        this.Z = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.F = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.f.h(this.h);
        this.I.removeCallbacksAndMessages(null);
        h(null);
    }
}
