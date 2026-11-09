package org.telegram.ui.Components;

import android.graphics.RuntimeShader;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class sa0 {
    public static /* synthetic */ RuntimeShader a() {
        return new RuntimeShader("uniform shader content;\nuniform shader alphaMask;\nuniform shader overlay;\nuniform float4 background_color_premultiplied;\nuniform float2 shader_offset;\nhalf4 main(float2 coord) {\n    half4 source = content.eval(coord);\n    half4 background = half4(background_color_premultiplied);\n    half4 base = source + background * (1.0 - source.a);\n    float2 shaderCoord = coord + shader_offset;\n    base *= alphaMask.eval(shaderCoord).a;\n    half4 top = overlay.eval(shaderCoord);\n    return top + base * (1.0 - top.a);\n}");
    }

    public static /* synthetic */ RuntimeShader b(String str) {
        return new RuntimeShader(str);
    }

    public static /* synthetic */ void c() {
    }
}
