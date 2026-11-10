package androidx.car.app.messaging.model;

import a8.r1;
import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import e0.j0;
import j$.util.Objects;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    public CarMessage(a aVar) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return r1.a(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
    }

    public CarText getBody() {
        return this.mBody;
    }

    public String getMultimediaMimeType() {
        return this.mMultimediaMimeType;
    }

    public Uri getMultimediaUri() {
        return this.mMultimediaUri;
    }

    public long getReceivedTimeEpochMillis() {
        return this.mReceivedTimeEpochMillis;
    }

    public j0 getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return j0.a(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(r1.b(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }
}
