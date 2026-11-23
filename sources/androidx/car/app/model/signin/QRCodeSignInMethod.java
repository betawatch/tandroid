package androidx.car.app.model.signin;

import android.net.Uri;
import j$.util.Objects;
import u.c;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class QRCodeSignInMethod implements c {
    private final Uri mUri;

    public QRCodeSignInMethod(Uri uri) {
        Objects.requireNonNull(uri);
        this.mUri = uri;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QRCodeSignInMethod) {
            return Objects.equals(this.mUri, ((QRCodeSignInMethod) obj).mUri);
        }
        return false;
    }

    public Uri getUri() {
        Uri uri = this.mUri;
        Objects.requireNonNull(uri);
        return uri;
    }

    public int hashCode() {
        return Objects.hash(this.mUri);
    }

    private QRCodeSignInMethod() {
        this.mUri = null;
    }
}
