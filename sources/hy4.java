// default package

import android.graphics.ColorMatrixColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class hy4 {
    public final RenderNode e;
    public final RenderNode f;
    public final RenderNode g;
    public final RenderNode h;
    public final RenderNode i;
    public ColorMatrixColorFilter j;
    public int k;
    public int l;
    public int m;
    public int n;
    public byte o;
    public byte p;
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

    public hy4(int i) {
        vk1.p();
        RenderNode renderNode = new RenderNode("cap-" + i);
        this.e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        vk1.p();
        RenderNode renderNode2 = new RenderNode("glass-" + i);
        this.f = renderNode2;
        renderNode2.setRenderEffect(zz.m());
        vk1.p();
        this.g = new RenderNode("glass-frosted-" + i);
        vk1.p();
        RenderNode renderNode3 = new RenderNode("filtered-" + i);
        this.h = renderNode3;
        renderNode3.setRenderEffect(RenderEffect.createColorFilterEffect(jy4.v));
        vk1.p();
        this.i = new RenderNode("frosted-filtered-" + i);
    }

    public final RenderNode a(int i) {
        int F = ik8.F(i);
        if (F == 0) {
            return this.e;
        }
        if (F == 1) {
            return this.f;
        }
        if (F == 2) {
            return this.g;
        }
        if (F == 3) {
            return this.i;
        }
        lq5.j("Unknown source index: ".concat(qd4.B(i)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, int i2, int i3) {
        if (this.o != i) {
            this.o = i;
            float N = hl.N(7.0f);
            float max = N <= 0.0f ? 0.0f : Math.max(0.0f, ((((N * 0.57735f) + 0.5f) / i) - 0.5f) / 0.57735f);
            this.s = max;
            this.e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.p != i2) {
            this.p = i2;
            float N2 = hl.N(36.0f);
            float max2 = N2 > 0.0f ? Math.max(0.0f, ((((N2 * 0.57735f) + 0.5f) / i2) - 0.5f) / 0.57735f) : 0.0f;
            this.t = max2;
            RenderNode renderNode = this.g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(max2, max2, tileMode));
            RenderNode renderNode2 = this.i;
            float f = this.t;
            renderNode2.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
        }
        this.q = i3;
    }

    public final void c(ColorMatrixColorFilter colorMatrixColorFilter) {
        if (this.j != colorMatrixColorFilter) {
            this.j = colorMatrixColorFilter;
            RenderNode renderNode = this.h;
            if (colorMatrixColorFilter == null) {
                colorMatrixColorFilter = jy4.v;
            }
            renderNode.setRenderEffect(RenderEffect.createColorFilterEffect(colorMatrixColorFilter));
        }
    }
}
