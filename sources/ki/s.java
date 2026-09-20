package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class s extends u {
    public final int e;

    public s() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), x.A);
        this.e = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
