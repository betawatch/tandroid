package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class w extends u {
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public w() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nuniform sampler2D nTexture;\nuniform sampler2D obTexture;\nuniform sampler2D nbTexture;\nuniform sampler2D oldBackground;\nuniform sampler2D newBackground;\nuniform sampler2D maskTexture;\nuniform float oldBlur;\nuniform float newBlur;\nuniform float mixValue;\nuniform float outsideEffect;\nvoid main() {\n    vec4 oldFrame = mix(texture2D(sTexture, vTextureCoord),\n            texture2D(obTexture, vTextureCoord), oldBlur);\n    vec4 newFrame = mix(texture2D(nTexture, vTextureCoord),\n            texture2D(nbTexture, vTextureCoord), newBlur);\n    vec3 camera = mix(oldFrame.rgb, newFrame.rgb, mixValue);\n    vec3 background = mix(texture2D(oldBackground, vTextureCoord).rgb,\n            texture2D(newBackground, vTextureCoord).rgb, mixValue) * 0.25;\n    float mask = texture2D(maskTexture, vTextureCoord).a;\n    vec3 composited = mix(background, camera, mask);\n    gl_FragColor = vec4(mix(camera, composited, outsideEffect), 1.0);\n}\n");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, "nTexture");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.a, "obTexture");
        int glGetUniformLocation3 = GLES20.glGetUniformLocation(this.a, "nbTexture");
        int glGetUniformLocation4 = GLES20.glGetUniformLocation(this.a, "oldBackground");
        int glGetUniformLocation5 = GLES20.glGetUniformLocation(this.a, "newBackground");
        int glGetUniformLocation6 = GLES20.glGetUniformLocation(this.a, "maskTexture");
        this.e = GLES20.glGetUniformLocation(this.a, "oldBlur");
        this.f = GLES20.glGetUniformLocation(this.a, "newBlur");
        this.g = GLES20.glGetUniformLocation(this.a, "mixValue");
        this.h = GLES20.glGetUniformLocation(this.a, "outsideEffect");
        GLES20.glUseProgram(this.a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
        GLES20.glUniform1i(glGetUniformLocation2, 2);
        GLES20.glUniform1i(glGetUniformLocation3, 3);
        GLES20.glUniform1i(glGetUniformLocation4, 4);
        GLES20.glUniform1i(glGetUniformLocation5, 5);
        GLES20.glUniform1i(glGetUniformLocation6, 6);
    }
}
