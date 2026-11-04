package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x9 {
    public int a;
    public final View b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f;
    public EGLContext g;
    public final Object h;
    public int i;
    public gi.ha j;
    public Object k;
    public Object l;
    public ca m;
    public final g2.d n;
    public Bitmap o;
    public int p;

    public x9(View view) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new Object();
        this.h = new Object();
        this.n = new g2.d(0, new vf(this, 14));
        this.p = 0;
        this.b = view;
        if (view.isAttachedToWindow()) {
            arrayList.clear();
            for (View view2 = view; view2 != null; view2 = (View) view2.getParent()) {
                arrayList.add(0, view2);
                if (!(view2.getParent() instanceof View)) {
                    break;
                }
            }
        }
        view.addOnAttachStateChangeListener(new ai.f2(this, 11));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f) {
            try {
                if (this.g == null) {
                    this.g = eGLContext;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ca caVar = this.m;
        if (caVar == null) {
            return this.o;
        }
        synchronized (caVar.n) {
            try {
                bitmap = !caVar.q ? null : caVar.p;
            } finally {
            }
        }
        return bitmap == null ? this.o : bitmap;
    }

    public final boolean c() {
        return this.l != null;
    }

    public final void d() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ba) obj).b.invalidate();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (i3 < size2) {
            Object obj2 = arrayList2.get(i3);
            i3++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ca caVar = this.m;
        if (caVar != null) {
            synchronized (caVar.n) {
                caVar.q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i3 = this.p;
        this.p = i3 + 1;
        sb2.append(i3);
        this.o = this.n.s(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(gi.ha haVar, Object obj) {
        this.j = haVar;
        this.k = obj;
        this.i = -14737633;
        if (obj == null || Build.VERSION.SDK_INT < 31) {
            this.l = null;
            return;
        }
        RenderNode renderNode = (RenderNode) obj;
        RenderNode renderNode2 = new RenderNode("blurRenderNode");
        renderNode2.setRenderEffect(RenderEffect.createBlurEffect(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(35.0f), Shader.TileMode.CLAMP));
        renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
        RecordingCanvas beginRecording = renderNode2.beginRecording();
        beginRecording.drawColor(-14737633);
        beginRecording.drawRenderNode(renderNode);
        renderNode2.endRecording();
        this.l = renderNode2;
    }
}
