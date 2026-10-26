package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.RenderNode;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ab1 extends cb1 {
    public final RenderNode e;

    public ab1(String str, int i10, int i11, int i12, int i13) {
        super(i10, i11, i12, i13);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i10, i11, i12, i13);
    }

    @Override // org.telegram.ui.Components.cb1
    public final Canvas a() {
        return this.e.beginRecording(this.c - this.a, this.d - this.b);
    }

    @Override // org.telegram.ui.Components.cb1
    public final boolean b(Canvas canvas) {
        return canvas.isHardwareAccelerated();
    }

    @Override // org.telegram.ui.Components.cb1
    public final void c() {
        this.e.discardDisplayList();
    }

    @Override // org.telegram.ui.Components.cb1
    public final void d(Canvas canvas, float f7) {
        if (this.e.hasDisplayList()) {
            this.e.setAlpha(f7);
            canvas.drawRenderNode(this.e);
        }
    }

    @Override // org.telegram.ui.Components.cb1
    public final void e() {
        this.e.endRecording();
    }

    @Override // org.telegram.ui.Components.cb1
    public final boolean f() {
        return this.e.hasDisplayList();
    }

    @Override // org.telegram.ui.Components.cb1
    public final void g() {
        this.e.setUseCompositingLayer(true, null);
    }
}
