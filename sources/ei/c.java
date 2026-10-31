package ei;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import c3.i0;
import e0.f0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class c {
    public final RenderNode e;
    public final RenderNode f;
    public final RenderNode g;
    public final RenderNode h;
    public final RenderNode i;
    public ColorFilter j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public float s;
    public float t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final RectF a = new RectF();
    public final Rect b = new Rect();
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public int q = 1;
    public final RectF r = new RectF();

    public c(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.f = renderNode2;
        renderNode2.setRenderEffect(f0.d());
        this.g = new RenderNode("glass-frosted-" + i10);
        RenderNode renderNode3 = new RenderNode("filtered-" + i10);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(e.v));
        this.i = new RenderNode("frosted-filtered-" + i10);
    }

    public final RenderNode a(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 == 0) {
            return this.e;
        }
        if (c10 == 1) {
            return this.f;
        }
        if (c10 == 2) {
            return this.g;
        }
        if (c10 == 3) {
            return this.i;
        }
        throw new IllegalArgumentException("Unknown source index: ".concat(i0.F(i10)));
    }

    public final void b(int i10, int i11, int i12) {
        if (this.o != i10) {
            this.o = i10;
            float N = org.telegram.messenger.i0.N(7.0f);
            float max = N <= 0.0f ? 0.0f : Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            this.s = max;
            this.e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.p != i11) {
            this.p = i11;
            float N2 = org.telegram.messenger.i0.N(36.0f);
            float max2 = N2 > 0.0f ? Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i11) - 0.5f) / 0.57735f) : 0.0f;
            this.t = max2;
            RenderNode renderNode = this.g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(max2, max2, tileMode));
            RenderNode renderNode2 = this.i;
            float f7 = this.t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f7, f7, tileMode));
        }
        this.q = i12;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.j != colorMatrixColorFilter) {
            this.j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = e.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
