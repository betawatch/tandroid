package ki;

import android.opengl.GLES20;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class s extends u {
    public final int e;

    public s() {
        super(AndroidUtilities.readRes(R.raw.round_blur_vert), x.A);
        this.e = GLES20.glGetUniformLocation(this.a, "texOffset");
    }
}
