package mi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import java.util.Arrays;
import w7.z;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class e extends z {
    public final RenderNode a = ah.f.o();
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    @Override // w7.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect, RectF rectF) {
        int i10;
        int i11;
        float f7;
        float f10;
        float f11;
        float f12;
        int i12;
        float f13;
        float f14;
        f fVar;
        int i13;
        RenderEffect[] renderEffectArr;
        float f15;
        int i14;
        int i15;
        int i16;
        float f16;
        float f17;
        RenderEffect renderEffect;
        int i17;
        f fVar2 = this.i;
        li.c cVar = fVar2.f;
        if (cVar != null) {
            li.d dVar = cVar.b;
            if ((cVar.a == 3 ? dVar.k : dVar.j) > 0) {
                i10 = 1;
                if (i10 == 0) {
                    li.d dVar2 = cVar.b;
                    i11 = cVar.a == 3 ? dVar2.k : dVar2.j;
                } else {
                    i11 = 1;
                }
                if (i10 == 0) {
                    float f18 = rectF.left;
                    li.d dVar3 = cVar.b;
                    f7 = f.l(f18, cVar.a == 3 ? dVar3.o : dVar3.m, i11) - (i10 * i11);
                } else {
                    f7 = rectF.left;
                }
                float f19 = f7;
                if (i10 == 0) {
                    float f20 = rectF.top;
                    li.d dVar4 = cVar.b;
                    f10 = f.l(f20, cVar.a == 3 ? dVar4.p : dVar4.n, i11) - (i10 * i11);
                } else {
                    f10 = rectF.top;
                }
                float f21 = f10;
                float f22 = f19 - rectF.left;
                f11 = f21 - rectF.top;
                f12 = i11;
                i12 = i10;
                int ceil = ((int) Math.ceil((rectF.right - f19) / f12)) + i12;
                int ceil2 = ((int) Math.ceil((rectF.bottom - f21) / f12)) + i12;
                if (fVar2.j && this.c == rect.width() && this.d == rect.height() && this.e == i11) {
                    f13 = f11;
                    f14 = f12;
                    fVar = fVar2;
                } else {
                    int i18 = fVar2.l;
                    float height = (i18 != 1 || i18 == 4) ? rect.height() : rect.width();
                    RuntimeShader runtimeShader = this.b;
                    g gVar = fVar2.m;
                    gVar.getClass();
                    float f23 = 0;
                    f13 = f11;
                    f14 = f12;
                    runtimeShader.setInputShader("alphaMask", f.m(fVar2, gVar, height, f23, -1, i11));
                    RuntimeShader runtimeShader2 = this.b;
                    g gVar2 = fVar2.n;
                    gVar2.getClass();
                    LinearGradient m10 = f.m(fVar2, gVar2, height, f23, fVar2.q, i11);
                    fVar = fVar2;
                    runtimeShader2.setInputShader("overlay", m10);
                    this.b.setFloatUniform("background_color_premultiplied", Color.red(fVar.q) / 255.0f, Color.green(fVar.q) / 255.0f, Color.blue(fVar.q) / 255.0f, 1.0f);
                    this.c = rect.width();
                    this.d = rect.height();
                    this.e = i11;
                    i13 = i11 * i11;
                    renderEffectArr = this.f;
                    if (renderEffectArr == null && renderEffectArr.length == i13) {
                        Arrays.fill(renderEffectArr, (Object) null);
                    } else {
                        this.f = new RenderEffect[i13];
                        this.g = new float[i13];
                        this.h = new float[i13];
                    }
                }
                if (i12 == 0) {
                    li.d dVar5 = cVar.b;
                    if (cVar.a == 3) {
                        f15 = f13;
                        i17 = dVar5.o;
                    } else {
                        f15 = f13;
                        i17 = dVar5.m;
                    }
                    int i19 = i17 % i11;
                    if (i19 != 0) {
                        i14 = (((i17 ^ i11) >> 31) | 1) > 0 ? i19 : i19 + i11;
                        if (i12 != 0) {
                            li.d dVar6 = cVar.b;
                            int i20 = cVar.a == 3 ? dVar6.p : dVar6.n;
                            int i21 = i20 % i11;
                            if (i21 != 0) {
                                i15 = (((i20 ^ i11) >> 31) | 1) > 0 ? i21 : i21 + i11;
                                i16 = (i15 * i11) + i14;
                                f16 = f22 / f14;
                                f17 = f15 / f14;
                                renderEffect = this.f[i16];
                                if (renderEffect != null || this.g[i16] != f16 || this.h[i16] != f17) {
                                    this.b.setFloatUniform("shader_offset", f16, f17);
                                    renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                                    this.f[i16] = renderEffect;
                                    this.g[i16] = f16;
                                    this.h[i16] = f17;
                                }
                                RenderEffect renderEffect2 = renderEffect;
                                this.a.setPosition(0, 0, ceil, ceil2);
                                this.a.setPivotX(0.0f);
                                this.a.setPivotY(0.0f);
                                this.a.setScaleX(f14);
                                this.a.setScaleY(f14);
                                this.a.setTranslationX(f22);
                                this.a.setTranslationY(f15);
                                RecordingCanvas beginRecording = this.a.beginRecording();
                                if (i12 == 0) {
                                    li.d.b(cVar.b, cVar.a, beginRecording, rectF, i11, f19, f21);
                                } else {
                                    beginRecording.save();
                                    beginRecording.translate(-rectF.left, -rectF.top);
                                    fVar.e.v(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
                                    beginRecording.restore();
                                }
                                this.a.endRecording();
                                this.a.setRenderEffect(renderEffect2);
                                fVar.j = false;
                            }
                        }
                        i15 = 0;
                        i16 = (i15 * i11) + i14;
                        f16 = f22 / f14;
                        f17 = f15 / f14;
                        renderEffect = this.f[i16];
                        if (renderEffect != null) {
                        }
                        this.b.setFloatUniform("shader_offset", f16, f17);
                        renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                        this.f[i16] = renderEffect;
                        this.g[i16] = f16;
                        this.h[i16] = f17;
                        RenderEffect renderEffect22 = renderEffect;
                        this.a.setPosition(0, 0, ceil, ceil2);
                        this.a.setPivotX(0.0f);
                        this.a.setPivotY(0.0f);
                        this.a.setScaleX(f14);
                        this.a.setScaleY(f14);
                        this.a.setTranslationX(f22);
                        this.a.setTranslationY(f15);
                        RecordingCanvas beginRecording2 = this.a.beginRecording();
                        if (i12 == 0) {
                        }
                        this.a.endRecording();
                        this.a.setRenderEffect(renderEffect22);
                        fVar.j = false;
                    }
                } else {
                    f15 = f13;
                }
                i14 = 0;
                if (i12 != 0) {
                }
                i15 = 0;
                i16 = (i15 * i11) + i14;
                f16 = f22 / f14;
                f17 = f15 / f14;
                renderEffect = this.f[i16];
                if (renderEffect != null) {
                }
                this.b.setFloatUniform("shader_offset", f16, f17);
                renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
                this.f[i16] = renderEffect;
                this.g[i16] = f16;
                this.h[i16] = f17;
                RenderEffect renderEffect222 = renderEffect;
                this.a.setPosition(0, 0, ceil, ceil2);
                this.a.setPivotX(0.0f);
                this.a.setPivotY(0.0f);
                this.a.setScaleX(f14);
                this.a.setScaleY(f14);
                this.a.setTranslationX(f22);
                this.a.setTranslationY(f15);
                RecordingCanvas beginRecording22 = this.a.beginRecording();
                if (i12 == 0) {
                }
                this.a.endRecording();
                this.a.setRenderEffect(renderEffect222);
                fVar.j = false;
            }
        }
        i10 = 0;
        if (i10 == 0) {
        }
        if (i10 == 0) {
        }
        float f192 = f7;
        if (i10 == 0) {
        }
        float f212 = f10;
        float f222 = f192 - rectF.left;
        f11 = f212 - rectF.top;
        f12 = i11;
        i12 = i10;
        int ceil3 = ((int) Math.ceil((rectF.right - f192) / f12)) + i12;
        int ceil22 = ((int) Math.ceil((rectF.bottom - f212) / f12)) + i12;
        if (fVar2.j) {
        }
        int i182 = fVar2.l;
        float height2 = (i182 != 1 || i182 == 4) ? rect.height() : rect.width();
        RuntimeShader runtimeShader3 = this.b;
        g gVar3 = fVar2.m;
        gVar3.getClass();
        float f232 = 0;
        f13 = f11;
        f14 = f12;
        runtimeShader3.setInputShader("alphaMask", f.m(fVar2, gVar3, height2, f232, -1, i11));
        RuntimeShader runtimeShader22 = this.b;
        g gVar22 = fVar2.n;
        gVar22.getClass();
        LinearGradient m102 = f.m(fVar2, gVar22, height2, f232, fVar2.q, i11);
        fVar = fVar2;
        runtimeShader22.setInputShader("overlay", m102);
        this.b.setFloatUniform("background_color_premultiplied", Color.red(fVar.q) / 255.0f, Color.green(fVar.q) / 255.0f, Color.blue(fVar.q) / 255.0f, 1.0f);
        this.c = rect.width();
        this.d = rect.height();
        this.e = i11;
        i13 = i11 * i11;
        renderEffectArr = this.f;
        if (renderEffectArr == null) {
        }
        this.f = new RenderEffect[i13];
        this.g = new float[i13];
        this.h = new float[i13];
        if (i12 == 0) {
        }
        i14 = 0;
        if (i12 != 0) {
        }
        i15 = 0;
        i16 = (i15 * i11) + i14;
        f16 = f222 / f14;
        f17 = f15 / f14;
        renderEffect = this.f[i16];
        if (renderEffect != null) {
        }
        this.b.setFloatUniform("shader_offset", f16, f17);
        renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
        this.f[i16] = renderEffect;
        this.g[i16] = f16;
        this.h[i16] = f17;
        RenderEffect renderEffect2222 = renderEffect;
        this.a.setPosition(0, 0, ceil3, ceil22);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f14);
        this.a.setScaleY(f14);
        this.a.setTranslationX(f222);
        this.a.setTranslationY(f15);
        RecordingCanvas beginRecording222 = this.a.beginRecording();
        if (i12 == 0) {
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect2222);
        fVar.j = false;
    }

    @Override // w7.z
    public final void b() {
        this.a.discardDisplayList();
        this.c = -1;
    }

    @Override // w7.z
    public final void c(Canvas canvas) {
        canvas.drawRenderNode(this.a);
    }

    @Override // w7.z
    public final boolean d() {
        return this.a.hasDisplayList();
    }

    @Override // w7.z
    public final void e(float f7) {
        this.a.setAlpha(f7);
    }
}
