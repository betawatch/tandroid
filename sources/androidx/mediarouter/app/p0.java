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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class p0 extends g.s {
    public static final /* synthetic */ int g0 = 0;
    public boolean B;
    public boolean C;
    public long D;
    public final d E;
    public RecyclerView F;
    public n0 G;
    public o0 H;
    public HashMap I;
    public c2.a0 J;
    public HashMap K;
    public boolean L;
    public boolean M;
    public boolean N;
    public ImageButton O;
    public Button P;
    public ImageView Q;
    public View R;
    public ImageView S;
    public TextView T;
    public TextView U;
    public String V;
    public bf.b W;
    public final s X;
    public MediaDescriptionCompat Y;
    public g0 Z;
    public Bitmap a0;
    public Uri b0;
    public boolean c0;
    public Bitmap d0;
    public int e0;
    public final c2.c0 f;
    public final boolean f0;
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
        super(r2, r0 == 0 ? j7.a0.e(r2) : r0);
        ContextThemeWrapper a2 = j7.a0.a(context, false);
        int g10 = j7.a0.g(a2, R.attr.mediaRouteTheme);
        this.n = c2.v.c;
        this.s = new ArrayList();
        this.v = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.E = new d(this, 2);
        Context context2 = getContext();
        this.y = context2;
        this.f = c2.c0.d(context2);
        this.f0 = c2.c0.g();
        this.h = new e(this, 3);
        this.r = c2.c0.f();
        this.X = new s(this, 1);
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
        MediaDescriptionCompat mediaDescriptionCompat = this.Y;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.e;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f : null;
        g0 g0Var = this.Z;
        Bitmap bitmap2 = g0Var == null ? this.a0 : g0Var.a;
        Uri uri2 = g0Var == null ? this.b0 : g0Var.b;
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            g0 g0Var2 = this.Z;
            if (g0Var2 != null) {
                g0Var2.cancel(true);
            }
            g0 g0Var3 = new g0(this);
            this.Z = g0Var3;
            g0Var3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        bf.b bVar = this.W;
        s sVar = this.X;
        if (bVar != null) {
            bVar.e0(sVar);
            this.W = null;
        }
        if (mediaSessionCompat$Token != null && this.C) {
            bf.b bVar2 = new bf.b(this.y, mediaSessionCompat$Token);
            this.W = bVar2;
            bVar2.Y(sVar);
            MediaMetadata metadata = ((android.support.v4.media.session.h) this.W.b).a.getMetadata();
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
            this.Y = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
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
        if (this.C) {
            c2.c0 c0Var = this.f;
            e eVar = this.h;
            c0Var.h(eVar);
            c0Var.a(vVar, eVar, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.y;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : j7.z.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.a0 = null;
        this.b0 = null;
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
        if ((this.J != null || this.L) ? true : !this.B) {
            this.N = true;
            return;
        }
        this.N = false;
        if (!this.r.g() || this.r.d()) {
            dismiss();
        }
        if (this.c0) {
            Bitmap bitmap = this.d0;
            if (!(bitmap != null && bitmap.isRecycled()) && this.d0 != null) {
                this.S.setVisibility(0);
                this.S.setImageBitmap(this.d0);
                this.S.setBackgroundColor(this.e0);
                this.R.setVisibility(0);
                Bitmap bitmap2 = this.d0;
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
                this.Q.setImageBitmap(copy);
                this.c0 = false;
                this.d0 = null;
                this.e0 = 0;
                MediaDescriptionCompat mediaDescriptionCompat = this.Y;
                CharSequence charSequence = mediaDescriptionCompat != null ? null : mediaDescriptionCompat.b;
                isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.Y;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (isEmpty) {
                    this.T.setText(charSequence);
                } else {
                    this.T.setText(this.V);
                }
                if (!isEmpty2) {
                    this.U.setVisibility(8);
                    return;
                } else {
                    this.U.setText(charSequence2);
                    this.U.setVisibility(0);
                    return;
                }
            }
        }
        Bitmap bitmap3 = this.d0;
        if (bitmap3 != null && bitmap3.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.d0);
        }
        this.S.setVisibility(8);
        this.R.setVisibility(8);
        this.Q.setImageBitmap(null);
        this.c0 = false;
        this.d0 = null;
        this.e0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat3 = this.Y;
        if (mediaDescriptionCompat3 != null) {
        }
        isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat22 = this.Y;
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
            ja.c b10 = this.r.b(a0Var);
            if (b10 != null) {
                c2.q qVar = (c2.q) b10.a;
                if (qVar != null && qVar.d) {
                    arrayList2.add(a0Var);
                }
                if (qVar != null && qVar.e) {
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
        this.G.G();
    }

    public final void n() {
        if (this.C) {
            if (SystemClock.uptimeMillis() - this.D < 300) {
                d dVar = this.E;
                dVar.removeMessages(1);
                dVar.sendEmptyMessageAtTime(1, this.D + 300);
                return;
            }
            if ((this.J != null || this.L) ? true : !this.B) {
                this.M = true;
                return;
            }
            this.M = false;
            if (!this.r.g() || this.r.d()) {
                dismiss();
            }
            this.D = SystemClock.uptimeMillis();
            this.G.F();
        }
    }

    public final void o() {
        if (this.M) {
            n();
        }
        if (this.N) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = true;
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
        decorView.setBackgroundColor(f0.e.c(context, j7.a0.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.O = imageButton;
        imageButton.setColorFilter(-1);
        this.O.setOnClickListener(new f0(this, 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.P = button;
        button.setTextColor(-1);
        this.P.setOnClickListener(new f0(this, 1));
        this.G = new n0(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.F = recyclerView;
        recyclerView.setAdapter(this.G);
        this.F.setLayoutManager(new f2.j0());
        this.H = new o0(this);
        this.I = new HashMap();
        this.K = new HashMap();
        this.Q = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.R = findViewById(R.id.mr_cast_meta_black_scrim);
        this.S = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.T = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.U = textView2;
        textView2.setTextColor(-1);
        this.V = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.B = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.C = false;
        this.f.h(this.h);
        this.E.removeCallbacksAndMessages(null);
        h(null);
    }
}
