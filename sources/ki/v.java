package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class v extends x {
    public final int e;

    public v() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), a0.A);
        this.e = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
