package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bb1 extends db1 {
    public final RenderNode e;

    public bb1(String str, int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.db1
    public final Canvas a() {
        return this.e.beginRecording(this.c - this.a, this.d - this.b);
    }

    @Override // org.telegram.ui.Components.db1
    public final boolean b(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override // org.telegram.ui.Components.db1
    public final void c() {
        this.e.discardDisplayList();
    }

    @Override // org.telegram.ui.Components.db1
    public final void d(Canvas canvas, float f7) {
        if (this.e.hasDisplayList()) {
            this.e.setAlpha(f7);
            canvas.drawRenderNode(this.e);
        }
    }

    @Override // org.telegram.ui.Components.db1
    public final void e() {
        this.e.endRecording();
    }

    @Override // org.telegram.ui.Components.db1
    public final boolean f() {
        return this.e.hasDisplayList();
    }

    @Override // org.telegram.ui.Components.db1
    public final void g() {
        this.e.setUseCompositingLayer(true, null);
    }
}
