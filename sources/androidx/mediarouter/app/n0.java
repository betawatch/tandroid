package androidx.mediarouter.app;

import a8.b7;
import a8.c7;
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
import org.telegram.ui.Cells.c5;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class n0 extends g.u {
    public static final /* synthetic */ int k0 = 0;
    public final Context E;
    public boolean F;
    public boolean G;
    public long H;
    public final android.support.v4.media.session.q I;
    public RecyclerView J;
    public l0 K;
    public m0 L;
    public HashMap M;
    public s4.v N;
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
    public wf.b a0;
    public final q b0;
    public MediaDescriptionCompat c0;
    public d0 d0;
    public Bitmap e0;
    public final s4.x f;
    public Uri f0;
    public boolean g0;
    public final c h;
    public Bitmap h0;
    public int i0;
    public final boolean j0;
    public s4.r n;
    public s4.v r;
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
    public n0(Context context) {
        super(r2, r0 == 0 ? c7.e(r2) : r0);
        ContextThemeWrapper a10 = c7.a(context, false);
        int g10 = c7.g(a10, R.attr.mediaRouteTheme);
        this.n = s4.r.c;
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        int i7 = 3;
        this.I = new android.support.v4.media.session.q(this, i7);
        Context context2 = getContext();
        this.E = context2;
        this.f = s4.x.d(context2);
        this.j0 = s4.x.g();
        this.h = new c(this, i7);
        this.r = s4.x.f();
        this.b0 = new q(this, 1);
        g(s4.x.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            s4.v vVar = (s4.v) list.get(size);
            if (vVar.d() || !vVar.g || !vVar.h(this.n) || this.r == vVar) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        d0 d0Var = this.d0;
        Bitmap bitmap2 = d0Var == null ? this.e0 : d0Var.a;
        Uri uri2 = d0Var == null ? this.f0 : d0Var.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            d0 d0Var2 = this.d0;
            if (d0Var2 != null) {
                d0Var2.cancel(true);
            }
            d0 d0Var3 = new d0(this);
            this.d0 = d0Var3;
            d0Var3.execute(new Void[0]);
        }
    }

    public final void g(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        wf.b bVar = this.a0;
        q qVar = this.b0;
        if (bVar != null) {
            bVar.T(qVar);
            this.a0 = null;
        }
        if (mediaSessionCompat$Token != null && this.G) {
            wf.b bVar2 = new wf.b(this.E, mediaSessionCompat$Token);
            this.a0 = bVar2;
            bVar2.O(qVar);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.a0.b).a.getMetadata();
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

    public final void i(s4.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.n.equals(rVar)) {
            return;
        }
        this.n = rVar;
        if (this.G) {
            s4.x xVar = this.f;
            c cVar = this.h;
            xVar.h(cVar);
            xVar.a(rVar, cVar, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.E;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : b7.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
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
        s4.u uVar = this.r.a;
        uVar.getClass();
        s4.x.b();
        for (s4.v vVar : DesugarCollections.unmodifiableList(uVar.b)) {
            c5 b10 = this.r.b(vVar);
            if (b10 != null) {
                s4.o oVar = (s4.o) b10.a;
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
        g(s4.x.e());
    }

    @Override // g.u, androidx.activity.m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.E;
        decorView.setBackgroundColor(context.getColor(c7.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.S = imageButton;
        imageButton.setColorFilter(-1);
        this.S.setOnClickListener(new c0(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.T = button;
        button.setTextColor(-1);
        this.T.setOnClickListener(new c0(this, 1));
        this.K = new l0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.J = recyclerView;
        recyclerView.setAdapter(this.K);
        this.J.setLayoutManager(new v4.c0());
        this.L = new m0(this);
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
        g(null);
    }
}
