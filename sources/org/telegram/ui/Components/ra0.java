package org.telegram.ui.Components;

import android.graphics.RuntimeShader;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class ra0 {
    public static /* synthetic */ RuntimeShader a() {
        return new RuntimeShader("uniform shader content;\nuniform shader alphaMask;\nuniform shader overlay;\nuniform float4 background_color_premultiplied;\nuniform float2 shader_offset;\nhalf4 main(float2 coord) {\n    half4 source = content.eval(coord);\n    half4 background = half4(background_color_premultiplied);\n    half4 base = source + background * (1.0 - source.a);\n    float2 shaderCoord = coord + shader_offset;\n    base *= alphaMask.eval(shaderCoord).a;\n    half4 top = overlay.eval(shaderCoord);\n    return top + base * (1.0 - top.a);\n}");
    }

    public static /* synthetic */ RuntimeShader b(String str) {
        return new RuntimeShader(str);
    }

    public static /* synthetic */ void c() {
    }
}
