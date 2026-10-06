package li;

import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import e0.h0;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class b {
    public final RenderNode e;
    public final RenderNode f;
    public final RenderNode g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float p;
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final RectF a = new RectF();
    public final Rect b = new Rect();
    public final RectF c = new RectF();
    public final RectF d = new RectF();
    public int n = 1;
    public final RectF o = new RectF();

    public b(int i10) {
        RenderNode renderNode = new RenderNode("cap-" + i10);
        this.e = renderNode;
        renderNode.setUseCompositingLayer(true, null);
        RenderNode renderNode2 = new RenderNode("glass-" + i10);
        this.f = renderNode2;
        renderNode2.setRenderEffect(h0.c());
        this.g = new RenderNode("glass-frosted-" + i10);
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
        throw new IllegalArgumentException("Unknown source index: ".concat(hg.c.D(i10)));
    }

    public final void b(int i10, int i11, int i12) {
        if (this.l != i10) {
            this.l = i10;
            float dpf2 = AndroidUtilities.dpf2(7.0f);
            float max = dpf2 <= 0.0f ? 0.0f : Math.max(0.0f, ((((dpf2 * 0.57735f) + 0.5f) / i10) - 0.5f) / 0.57735f);
            this.p = max;
            this.e.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        }
        if (this.m != i11) {
            this.m = i11;
            float dpf22 = AndroidUtilities.dpf2(36.0f);
            float max2 = dpf22 > 0.0f ? Math.max(0.0f, ((((dpf22 * 0.57735f) + 0.5f) / i11) - 0.5f) / 0.57735f) : 0.0f;
            this.q = max2;
            this.g.setRenderEffect(RenderEffect.createBlurEffect(max2, max2, Shader.TileMode.CLAMP));
        }
        this.n = i12;
    }
}
