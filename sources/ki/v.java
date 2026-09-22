package ki;

import android.opengl.GLES20;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class v extends r {
    public final int f;
    public final int g;
    public final int h;

    public v() {
        super("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nvarying vec2 vScreenTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform sampler2D hTexture;\nuniform vec2 sampleStepX;\nuniform vec2 sampleStepY;\nuniform float historyWeight;\nvoid main() {\n    vec3 current = texture2D(sTexture, vTextureCoord).rgb * 0.25;\n    current += (texture2D(sTexture, vTextureCoord + sampleStepX).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepX).rgb\n            + texture2D(sTexture, vTextureCoord + sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepY).rgb) * 0.125;\n    current += (texture2D(sTexture, vTextureCoord + sampleStepX + sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord + sampleStepX - sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepX + sampleStepY).rgb\n            + texture2D(sTexture, vTextureCoord - sampleStepX - sampleStepY).rgb) * 0.0625;\n    vec3 history = texture2D(hTexture, vScreenTextureCoord).rgb;\n    float difference = dot(abs(current - history), vec3(0.333333));\n    float motion = smoothstep(0.035, 0.18, difference);\n    float weight = mix(historyWeight, historyWeight * 0.65, motion);\n    gl_FragColor = vec4(mix(current, history, weight), 1.0);\n}\n");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, "hTexture");
        this.f = GLES20.glGetUniformLocation(this.a, "sampleStepX");
        this.g = GLES20.glGetUniformLocation(this.a, "sampleStepY");
        this.h = GLES20.glGetUniformLocation(this.a, "historyWeight");
        GLES20.glUseProgram(this.a);
        GLES20.glUniform1i(glGetUniformLocation, 1);
    }
}
