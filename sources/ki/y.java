package ki;

import android.opengl.GLES20;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class y extends w {
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(boolean z10, boolean z11) {
        super("attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = aPosition;\n    vTextureCoord = aTextureCoord.xy;\n}\n", r9);
        String replace;
        String str = z10 ? "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D omTexture;\nuniform sampler2D nTexture;\nuniform sampler2D nbTexture;\nuniform sampler2D oldBackground;\nuniform sampler2D newBackground;\nuniform sampler2D maskTexture;\nuniform vec2 oldBlurStep;\nuniform float oldMipBias;\nuniform float oldBlurMix;\nuniform float newBlur;\nuniform float mixValue;\nvec4 sampleOldFrame() {\n    vec2 x = vec2(oldBlurStep.x, 0.0);\n    vec2 diagonalUp = vec2(oldBlurStep.x * 0.5, oldBlurStep.y * 0.8660254);\n    vec2 diagonalDown = vec2(oldBlurStep.x * 0.5, -oldBlurStep.y * 0.8660254);\n    vec4 color = sampleOldMip(omTexture, vTextureCoord, oldMipBias) * 0.25;\n    color += (sampleOldMip(omTexture, vTextureCoord + x, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord - x, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord + diagonalUp, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord - diagonalUp, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord + diagonalDown, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord - diagonalDown, oldMipBias)) * 0.125;\n    return mix(texture2D(sTexture, vTextureCoord), color, oldBlurMix);\n}\nvoid main() {\n    vec4 oldFrame = sampleOldFrame();\n    vec4 newFrame = mix(texture2D(nTexture, vTextureCoord),\n            texture2D(nbTexture, vTextureCoord), newBlur);\n    vec3 camera = mix(oldFrame.rgb, newFrame.rgb, mixValue);\n    vec3 background = mix(texture2D(oldBackground, vTextureCoord).rgb,\n            texture2D(newBackground, vTextureCoord).rgb, mixValue) * 0.25;\n    float mask = texture2D(maskTexture, vTextureCoord).a;\n    gl_FragColor = vec4(mix(background, camera, mask), 1.0);\n}\n" : "#ifdef GL_FRAGMENT_PRECISION_HIGH\nprecision highp float;\n#else\nprecision mediump float;\n#endif\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D omTexture;\nuniform sampler2D nTexture;\nuniform sampler2D nbTexture;\nuniform vec2 oldBlurStep;\nuniform float oldMipBias;\nuniform float oldBlurMix;\nuniform float newBlur;\nuniform float mixValue;\nvec4 sampleOldFrame() {\n    vec2 x = vec2(oldBlurStep.x, 0.0);\n    vec2 diagonalUp = vec2(oldBlurStep.x * 0.5, oldBlurStep.y * 0.8660254);\n    vec2 diagonalDown = vec2(oldBlurStep.x * 0.5, -oldBlurStep.y * 0.8660254);\n    vec4 color = sampleOldMip(omTexture, vTextureCoord, oldMipBias) * 0.25;\n    color += (sampleOldMip(omTexture, vTextureCoord + x, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord - x, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord + diagonalUp, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord - diagonalUp, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord + diagonalDown, oldMipBias)\n            + sampleOldMip(omTexture, vTextureCoord - diagonalDown, oldMipBias)) * 0.125;\n    return mix(texture2D(sTexture, vTextureCoord), color, oldBlurMix);\n}\nvoid main() {\n    vec4 oldFrame = sampleOldFrame();\n    vec4 newFrame = mix(texture2D(nTexture, vTextureCoord),\n            texture2D(nbTexture, vTextureCoord), newBlur);\n    gl_FragColor = mix(oldFrame, newFrame, mixValue);\n}\n";
        if (z11) {
            replace = "#extension GL_EXT_shader_texture_lod : require\n" + str.replace("sampleOldMip", "texture2DLodEXT");
        } else {
            replace = str.replace("sampleOldMip", "texture2D");
        }
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, "omTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.a, "nTexture");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.a, "nbTexture");
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.a, "oldBackground");
        int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.a, "newBackground");
        int glGetUniformLocation6 = GLES20.glGetUniformLocation(this.a, "maskTexture");
        this.e = GLES20.glGetUniformLocation(this.a, "oldBlurStep");
        this.f = GLES20.glGetUniformLocation(this.a, "oldMipBias");
        this.g = GLES20.glGetUniformLocation(this.a, "oldBlurMix");
        this.h = GLES20.glGetUniformLocation(this.a, "newBlur");
        this.i = GLES20.glGetUniformLocation(this.a, "mixValue");
        GLES20.glUseProgram(this.a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
        GLES20.glUniform1i(glGetUniformLocation2, 2);
        GLES20.glUniform1i(glGetUniformLocation3, 3);
        if (z10) {
            GLES20.glUniform1i(glGetUniformLocation4, 4);
            GLES20.glUniform1i(glGetUniformLocation5, 5);
            GLES20.glUniform1i(glGetUniformLocation6, 6);
        }
    }
}
