package ac;

import androidx.lifecycle.b0;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import com.google.android.gms.common.api.n;
import java.io.Closeable;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public interface c extends Closeable, s, n {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @b0(m.ON_DESTROY)
    void close();
}
