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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ba {
    public int a;
    public final View b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final Object f;
    public EGLContext g;
    public final Object h;
    public int i;
    public kh.ib j;
    public Object k;
    public Object l;
    public ha m;
    public final ga n;
    public Bitmap o;
    public int p;

    public ba(View view) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new Object();
        this.h = new Object();
        this.n = new ga(0, new fg(this, 14));
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
        view.addOnAttachStateChangeListener(new af.b(this, 9));
    }

    public final void a(EGLContext eGLContext) {
        synchronized (this.f) {
            try {
                if (this.g == null) {
                    this.g = eGLContext;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap b() {
        Bitmap bitmap;
        ha haVar = this.m;
        if (haVar == null) {
            return this.o;
        }
        synchronized (haVar.n) {
            try {
                bitmap = !haVar.q ? null : haVar.p;
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
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((fa) obj).b.invalidate();
        }
        ArrayList arrayList2 = this.e;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj2 = arrayList2.get(i9);
            i9++;
            ((Runnable) obj2).run();
        }
    }

    public final void e() {
        ha haVar = this.m;
        if (haVar != null) {
            synchronized (haVar.n) {
                haVar.q = false;
            }
        }
    }

    public final void f(Bitmap bitmap, boolean z10) {
        StringBuilder sb2 = new StringBuilder("");
        int i9 = this.p;
        this.p = i9 + 1;
        sb2.append(i9);
        this.o = this.n.b(bitmap, sb2.toString(), 0, 0, z10);
    }

    public final void g(kh.ib ibVar, Object obj) {
        this.j = ibVar;
        this.k = obj;
        this.i = -14737633;
        if (obj == null || Build.VERSION.SDK_INT < 31) {
            this.l = null;
            return;
        }
        RenderNode renderNode = (RenderNode) obj;
        RenderNode renderNode2 = new RenderNode("blurRenderNode");
        renderNode2.setRenderEffect(RenderEffect.createBlurEffect(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(35.0f), Shader.TileMode.CLAMP));
        renderNode2.setPosition(0, 0, renderNode.getWidth(), renderNode.getHeight());
        RecordingCanvas beginRecording = renderNode2.beginRecording();
        beginRecording.drawColor(-14737633);
        beginRecording.drawRenderNode(renderNode);
        renderNode2.endRecording();
        this.l = renderNode2;
    }
}
