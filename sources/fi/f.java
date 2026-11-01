package fi;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.RuntimeShader;
import android.support.v4.media.session.w;
import java.util.Arrays;
import v7.i7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes4.dex */
public final class f extends i7 {
    public final RenderNode a = w.m();
    public final RuntimeShader b = e.a();
    public int c = -1;
    public int d = -1;
    public int e;
    public RenderEffect[] f;
    public float[] g;
    public float[] h;
    public final /* synthetic */ g i;

    public f(g gVar) {
        this.i = gVar;
    }

    @Override // v7.i7
    public final void a(Rect rect, RectF rectF) {
        float f7;
        a aVar;
        int i10;
        int i11;
        int i12;
        int a2;
        int a10;
        int g10;
        int g11;
        g gVar = this.i;
        a aVar2 = gVar.h;
        int i13 = (aVar2 == null || !aVar2.h() || aVar2.f() <= 0) ? 0 : 1;
        int f10 = i13 != 0 ? aVar2.f() : 1;
        float l4 = i13 != 0 ? g.l(rectF.left, aVar2.g(), f10) - (i13 * f10) : rectF.left;
        float l10 = i13 != 0 ? g.l(rectF.top, aVar2.a(), f10) - (i13 * f10) : rectF.top;
        float f11 = l4 - rectF.left;
        float f12 = l10 - rectF.top;
        float f13 = f10;
        int ceil = ((int) Math.ceil((rectF.right - l4) / f13)) + i13;
        int ceil2 = ((int) Math.ceil((rectF.bottom - l10) / f13)) + i13;
        if (!gVar.w && this.c == rect.width() && this.d == rect.height() && this.e == f10) {
            aVar = aVar2;
            i11 = i13;
            i10 = ceil;
            f7 = f13;
            i12 = ceil2;
        } else {
            int i14 = gVar.y;
            float height = (i14 == 1 || i14 == 4) ? rect.height() : rect.width();
            RuntimeShader runtimeShader = this.b;
            h hVar = gVar.D;
            hVar.getClass();
            float f14 = 0;
            f7 = f13;
            aVar = aVar2;
            i10 = ceil;
            i11 = i13;
            i12 = ceil2;
            runtimeShader.setInputShader("alphaMask", g.k(gVar, hVar, height, f14, -1, f10));
            RuntimeShader runtimeShader2 = this.b;
            h hVar2 = gVar.E;
            hVar2.getClass();
            runtimeShader2.setInputShader("overlay", g.k(gVar, hVar2, height, f14, gVar.H, f10));
            this.b.setFloatUniform("background_color_premultiplied", Color.red(gVar.H) / 255.0f, Color.green(gVar.H) / 255.0f, Color.blue(gVar.H) / 255.0f, 1.0f);
            this.c = rect.width();
            this.d = rect.height();
            this.e = f10;
            int i15 = f10 * f10;
            RenderEffect[] renderEffectArr = this.f;
            if (renderEffectArr == null || renderEffectArr.length != i15) {
                this.f = new RenderEffect[i15];
                this.g = new float[i15];
                this.h = new float[i15];
            } else {
                Arrays.fill(renderEffectArr, (Object) null);
            }
        }
        int i16 = (((i11 == 0 || (a10 = (a2 = aVar.a()) % f10) == 0) ? 0 : (((a2 ^ f10) >> 31) | 1) > 0 ? a10 : a10 + f10) * f10) + ((i11 == 0 || (g11 = (g10 = aVar.g()) % f10) == 0) ? 0 : (((g10 ^ f10) >> 31) | 1) > 0 ? g11 : g11 + f10);
        float f15 = f11 / f7;
        float f16 = f12 / f7;
        RenderEffect renderEffect = this.f[i16];
        if (renderEffect == null || this.g[i16] != f15 || this.h[i16] != f16) {
            this.b.setFloatUniform("shader_offset", f15, f16);
            renderEffect = RenderEffect.createRuntimeShaderEffect(this.b, "content");
            this.f[i16] = renderEffect;
            this.g[i16] = f15;
            this.h[i16] = f16;
        }
        this.a.setPosition(0, 0, i10, i12);
        this.a.setPivotX(0.0f);
        this.a.setPivotY(0.0f);
        this.a.setScaleX(f7);
        this.a.setScaleY(f7);
        this.a.setTranslationX(f11);
        this.a.setTranslationY(f12);
        RecordingCanvas beginRecording = this.a.beginRecording();
        if (i11 != 0) {
            gVar.h.d(l4, l10, f10, beginRecording, rectF);
        } else {
            beginRecording.save();
            beginRecording.translate(-rectF.left, -rectF.top);
            gVar.f.e(beginRecording, rectF.left, rectF.top, rectF.right, rectF.bottom);
            beginRecording.restore();
        }
        this.a.endRecording();
        this.a.setRenderEffect(renderEffect);
        gVar.w = false;
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
