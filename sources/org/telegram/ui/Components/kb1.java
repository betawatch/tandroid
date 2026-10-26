package org.telegram.ui.Components;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class kb1 {
    public static void a(nb1 nb1Var, e0.e0 e0Var, JSONArray jSONArray, int i10, JSONObject jSONObject, mb1 mb1Var, float f7) {
        JSONArray optJSONArray = jSONObject.optJSONArray("fl");
        RenderEffect c10 = optJSONArray == null ? null : c(optJSONArray, f7, Shader.TileMode.CLAMP);
        Matrix matrix = new Matrix();
        if (c10 == null || !((Matrix) e0Var.d).invert(matrix)) {
            return;
        }
        if (nb1.i(jSONObject, "r", new RectF()).isEmpty()) {
            return;
        }
        RenderNode renderNode = new RenderNode("widget-backdrop");
        renderNode.setPosition((int) Math.floor(r2.left * f7), (int) Math.floor(r2.top * f7), (int) Math.ceil(r2.right * f7), (int) Math.ceil(r2.bottom * f7));
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-r3, -r4);
        beginRecording.scale(f7, f7);
        beginRecording.concat(matrix);
        nb1Var.e(beginRecording, jSONArray, i10, mb1Var, f7, false);
        renderNode.endRecording();
        renderNode.setRenderEffect(c10);
        Canvas canvas = (Canvas) e0Var.c;
        canvas.save();
        Path path = nb1Var.f;
        nb1Var.j(jSONObject, "r", path);
        canvas.clipPath(path);
        float f10 = 1.0f / f7;
        canvas.scale(f10, f10);
        canvas.drawRenderNode(renderNode);
        canvas.restore();
    }

    public static Canvas b(lb1 lb1Var, RectF rectF, JSONArray jSONArray, float f7) {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        RenderEffect c10 = c(jSONArray, f7, tileMode);
        if (c10 == null) {
            return null;
        }
        RenderNode renderNode = new RenderNode("widget-filter");
        lb1Var.d = ((int) Math.floor(rectF.left * f7)) - 1;
        int floor = ((int) Math.floor(rectF.top * f7)) - 1;
        lb1Var.e = floor;
        renderNode.setPosition(lb1Var.d, floor, ((int) Math.ceil(rectF.right * f7)) + 1, ((int) Math.ceil(rectF.bottom * f7)) + 1);
        renderNode.setRenderEffect(c10);
        lb1Var.c = renderNode;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        beginRecording.translate(-lb1Var.d, -lb1Var.e);
        beginRecording.scale(f7, f7);
        return beginRecording;
    }

    public static RenderEffect c(JSONArray jSONArray, float f7, Shader.TileMode tileMode) {
        BlendMode blendMode;
        Shader.TileMode tileMode2;
        RenderEffect renderEffect = null;
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONArray optJSONArray = jSONArray.optJSONArray(i10);
            if (optJSONArray != null) {
                float optDouble = (float) optJSONArray.optDouble(1);
                int optInt = optJSONArray.optInt(0);
                if (optInt == 0) {
                    float f10 = optDouble * f7;
                    float f11 = f10 > 0.5f ? (f10 - 0.5f) / 0.57735f : 0.0f;
                    if (f11 > 0.0f) {
                        renderEffect = renderEffect == null ? RenderEffect.createBlurEffect(f11, f11, tileMode) : RenderEffect.createBlurEffect(f11, f11, renderEffect, tileMode);
                    }
                } else if (optInt != 1) {
                    if (optInt == 9) {
                        if (renderEffect == null) {
                            renderEffect = RenderEffect.createOffsetEffect(0.0f, 0.0f);
                        }
                        RenderEffect createOffsetEffect = RenderEffect.createOffsetEffect(((float) optJSONArray.optDouble(2)) * f7, ((float) optJSONArray.optDouble(3)) * f7, RenderEffect.createColorFilterEffect(new PorterDuffColorFilter((int) optJSONArray.optLong(4), PorterDuff.Mode.SRC_IN), renderEffect));
                        float f12 = (optDouble / 2.0f) * f7;
                        float f13 = f12 > 0.5f ? (f12 - 0.5f) / 0.57735f : 0.0f;
                        if (f13 > 0.0f) {
                            tileMode2 = Shader.TileMode.DECAL;
                            createOffsetEffect = RenderEffect.createBlurEffect(f13, f13, createOffsetEffect, tileMode2);
                        }
                        blendMode = BlendMode.SRC_OVER;
                        renderEffect = RenderEffect.createBlendModeEffect(createOffsetEffect, renderEffect, blendMode);
                    }
                } else if (renderEffect == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setScale(optDouble, optDouble, optDouble, 1.0f);
                    renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
                } else {
                    ColorMatrix colorMatrix2 = new ColorMatrix();
                    colorMatrix2.setScale(optDouble, optDouble, optDouble, 1.0f);
                    renderEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix2), renderEffect);
                }
            }
        }
        return renderEffect;
    }

    public static void d(lb1 lb1Var, float f7) {
        RenderNode c10 = org.telegram.messenger.d.c(lb1Var.c);
        c10.endRecording();
        lb1Var.a.save();
        float f10 = 1.0f / f7;
        lb1Var.a.scale(f10, f10);
        lb1Var.a.drawRenderNode(c10);
        lb1Var.a.restore();
    }
}
