package fi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import c3.i0;
import java.util.Arrays;
import v7.i7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class e extends i7 {
    public final RenderNode a = w.m();
    public final RuntimeShader b = d.a();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final /* synthetic */ f i;

    public e(f fVar) {
        this.i = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // v7.i7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        int ceil;
        int ceil2;
        float f12;
        int i12;
        int i13;
        int i14;
        f fVar;
        int i15;
        RenderEffect[] renderEffectArr;
        int i16;
        int i17;
        int i18;
        float f13;
        float f14;
        RenderEffect renderEffect;
        f fVar2 = this.i;
        ei.d dVar = fVar2.h;
        if (dVar != null) {
            ei.e eVar = dVar.b;
            if ((i0.b(dVar.a) ? eVar.n : eVar.m) > 0) {
                i10 = 1;
                if (i10 == 0) {
                    ei.e eVar2 = dVar.b;
                    i11 = i0.b(dVar.a) ? eVar2.n : eVar2.m;
                } else {
                    i11 = 1;
                }
                if (i10 == 0) {
                    float f15 = rectF.left;
                    ei.e eVar3 = dVar.b;
                    f7 = f.k(f15, i0.b(dVar.a) ? eVar3.r : eVar3.p, i11) - (i10 * i11);
                } else {
                    f7 = rectF.left;
                }
                float f16 = f7;
                if (i10 == 0) {
                    float f17 = rectF.top;
                    ei.e eVar4 = dVar.b;
                    f10 = f.k(f17, i0.b(dVar.a) ? eVar4.s : eVar4.q, i11) - (i10 * i11);
                } else {
                    f10 = rectF.top;
                }
                float f18 = f10;
                float f19 = f16 - rectF.left;
                float f20 = f18 - rectF.top;
                f11 = i11;
                ceil = ((int) Math.ceil((rectF.right - f16) / f11)) + i10;
                ceil2 = ((int) Math.ceil((rectF.bottom - f18) / f11)) + i10;
                if (fVar2.w && this.c == rect.width() && this.d == rect.height() && this.e == i11) {
                    i12 = i10;
                    i13 = ceil;
                    f12 = f11;
                    i14 = ceil2;
                    fVar = fVar2;
                } else {
                    int i19 = fVar2.y;
                    float height = (i19 != 1 || i19 == 4) ? rect.height() : rect.width();
                    RuntimeShader runtimeShader = this.b;
                    g gVar = fVar2.D;
                    gVar.getClass();
                    float f21 = 0;
                    f12 = f11;
                    i12 = i10;
                    i13 = ceil;
                    i14 = ceil2;
                    runtimeShader.setInputShader("alphaMask", f.l(fVar2, gVar, height, f21, -1, i11));
                    RuntimeShader runtimeShader2 = this.b;
                    g gVar2 = fVar2.E;
                    gVar2.getClass();
                    LinearGradient l4 = f.l(fVar2, gVar2, height, f21, fVar2.H, i11);
                    fVar = fVar2;
                    runtimeShader2.setInputShader("overlay", l4);
                    this.b.setFloatUniform("background_color_premultiplied", Color.red(fVar.H) / 255.0f, Color.green(fVar.H) / 255.0f, Color.blue(fVar.H) / 255.0f, 1.0f);
                    this.c = rect.width();
                    this.d = rect.height();
                    this.e = i11;
                    i15 = i11 * i11;
                    renderEffectArr = this.f;
                    if (renderEffectArr == null && renderEffectArr.length == i15) {
                        Arrays.fill(renderEffectArr, (Object) null);
                    } else {
                        this.f = new RenderEffect[i15];
                        this.g = new float[i15];
                        this.h = new float[i15];
                    }
                }
                if (i12 != 0) {
                    ei.e eVar5 = dVar.b;
                    int i20 = i0.b(dVar.a) ? eVar5.r : eVar5.p;
                    int i21 = i20 % i11;
                    if (i21 != 0) {
                        i16 = (((i20 ^ i11) >> 31) | 1) > 0 ? i21 : i21 + i11;
                        if (i12 != 0) {
                            ei.e eVar6 = dVar.b;
                            int i22 = i0.b(dVar.a) ? eVar6.s : eVar6.q;
                            int i23 = i22 % i11;
                            if (i23 != 0) {
                                i17 = (((i22 ^ i11) >> 31) | 1) > 0 ? i23 : i23 + i11;
                                i18 = (i17 * i11) + i16;
                                f13 = f19 / f12;
                                f14 = f20 / f12;
                                renderEffect = this.f[i18];
                                if (renderEffect != null || this.g[i18] != f13 || this.h[i18] != f14) {
                                    this.b.setFloatUniform("shader_offset", f13, f14);
                                    renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                                    this.f[i18] = renderEffect;
                                    this.g[i18] = f13;
                                    this.h[i18] = f14;
                                }
                                this.a.setPosition(0, 0, i13, i14);
                                this.a.setPivotX(0.0f);
                                this.a.setPivotY(0.0f);
                                this.a.setScaleX(f12);
                                this.a.setScaleY(f12);
                                this.a.setTranslationX(f19);
                                this.a.setTranslationY(f20);
                                RecordingCanvas beginRecording = this.a.beginRecording();
                                if (i12 == 0) {
                                    ei.e.b(dVar.b, dVar.a, beginRecording, rectF, i11, f16, f18);
                                } else {
                                    beginRecording.save();
                                    beginRecording.translate(-rectF.left, -rectF.top);
                                    fVar.f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
                                    beginRecording.restore();
                                }
                                this.a.endRecording();
                                this.a.setRenderEffect(renderEffect);
                                fVar.w = false;
                            }
                        }
                        i17 = 0;
                        i18 = (i17 * i11) + i16;
                        f13 = f19 / f12;
                        f14 = f20 / f12;
                        renderEffect = this.f[i18];
                        if (renderEffect != null) {
                        }
                        this.b.setFloatUniform("shader_offset", f13, f14);
                        renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                        this.f[i18] = renderEffect;
                        this.g[i18] = f13;
                        this.h[i18] = f14;
                        this.a.setPosition(0, 0, i13, i14);
                        this.a.setPivotX(0.0f);
                        this.a.setPivotY(0.0f);
                        this.a.setScaleX(f12);
                        this.a.setScaleY(f12);
                        this.a.setTranslationX(f19);
                        this.a.setTranslationY(f20);
                        RecordingCanvas beginRecording2 = this.a.beginRecording();
                        if (i12 == 0) {
                        }
                        this.a.endRecording();
                        this.a.setRenderEffect(renderEffect);
                        fVar.w = false;
                    }
                }
                i16 = 0;
                if (i12 != 0) {
                }
                i17 = 0;
                i18 = (i17 * i11) + i16;
                f13 = f19 / f12;
                f14 = f20 / f12;
                renderEffect = this.f[i18];
                if (renderEffect != null) {
                }
                this.b.setFloatUniform("shader_offset", f13, f14);
                renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                this.f[i18] = renderEffect;
                this.g[i18] = f13;
                this.h[i18] = f14;
                this.a.setPosition(0, 0, i13, i14);
                this.a.setPivotX(0.0f);
                this.a.setPivotY(0.0f);
                this.a.setScaleX(f12);
                this.a.setScaleY(f12);
                this.a.setTranslationX(f19);
                this.a.setTranslationY(f20);
                RecordingCanvas beginRecording22 = this.a.beginRecording();
                if (i12 == 0) {
                }
                this.a.endRecording();
                this.a.setRenderEffect(renderEffect);
                fVar.w = false;
            }
        }
        i10 = 0;
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        float f162 = f7;
        if (i10 == 0) {
        }
        float f182 = f10;
        float f192 = f162 - rectF.left;
        float f202 = f182 - rectF.top;
        f11 = i11;
        ceil = ((int) Math.ceil((rectF.right - f162) / f11)) + i10;
        ceil2 = ((int) Math.ceil((rectF.bottom - f182) / f11)) + i10;
        if (fVar2.w) {
        }
        int i192 = fVar2.y;
        float height2 = (i192 != 1 || i192 == 4) ? rect.height() : rect.width();
        RuntimeShader runtimeShader3 = this.b;
        g gVar3 = fVar2.D;
        gVar3.getClass();
        float f212 = 0;
        f12 = f11;
        i12 = i10;
        i13 = ceil;
        i14 = ceil2;
        runtimeShader3.setInputShader("alphaMask", f.l(fVar2, gVar3, height2, f212, -1, i11));
        RuntimeShader runtimeShader22 = this.b;
        g gVar22 = fVar2.E;
        gVar22.getClass();
        LinearGradient l42 = f.l(fVar2, gVar22, height2, f212, fVar2.H, i11);
        fVar = fVar2;
        runtimeShader22.setInputShader("overlay", l42);
        this.b.setFloatUniform("background_color_premultiplied", Color.red(fVar.H) / 255.0f, Color.green(fVar.H) / 255.0f, Color.blue(fVar.H) / 255.0f, 1.0f);
        this.c = rect.width();
        this.d = rect.height();
        this.e = i11;
        i15 = i11 * i11;
        renderEffectArr = this.f;
        if (renderEffectArr == null) {
        }
        this.f = new RenderEffect[i15];
        this.g = new float[i15];
        this.h = new float[i15];
        if (i12 != 0) {
        }
        i16 = 0;
        if (i12 != 0) {
        }
        i17 = 0;
        i18 = (i17 * i11) + i16;
        f13 = f192 / f12;
        f14 = f202 / f12;
        renderEffect = this.f[i18];
        if (renderEffect != null) {
        }
        this.b.setFloatUniform("shader_offset", f13, f14);
        renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
        this.f[i18] = renderEffect;
        this.g[i18] = f13;
        this.h[i18] = f14;
        this.a.setPosition(0, 0, i13, i14);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f12);
        this.a.setScaleY(f12);
        this.a.setTranslationX(f192);
        this.a.setTranslationY(f202);
        RecordingCanvas beginRecording222 = this.a.beginRecording();
        if (i12 == 0) {
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        fVar.w = false;
    }

    @Override // v7.i7
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // v7.i7
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // v7.i7
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // v7.i7
    public final void e(float f7) {
        this.a.setAlpha(f7);
    }
}
