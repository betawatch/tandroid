package androidx.car.app.messaging.model;

import android.net.Uri;
import android.os.Bundle;
import androidx.car.app.model.CarText;
import j$.util.Objects;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class CarMessage {
    private final CarText mBody;
    private final boolean mIsRead;
    private final String mMultimediaMimeType;
    private final Uri mMultimediaUri;
    private final long mReceivedTimeEpochMillis;
    private final Bundle mSender;

    private CarMessage() {
        this.mSender = null;
        this.mBody = null;
        this.mMultimediaMimeType = null;
        this.mMultimediaUri = null;
        this.mReceivedTimeEpochMillis = 0L;
        this.mIsRead = false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarMessage)) {
            return false;
        }
        CarMessage carMessage = (CarMessage) obj;
        return nve.a(getSender(), carMessage.getSender()) && Objects.equals(this.mBody, carMessage.mBody) && this.mReceivedTimeEpochMillis == carMessage.mReceivedTimeEpochMillis && this.mIsRead == carMessage.mIsRead;
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

    public b78 getSender() {
        Bundle bundle = this.mSender;
        if (bundle == null) {
            return null;
        }
        return b78.a(bundle);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(nve.b(getSender())), this.mBody, Long.valueOf(this.mReceivedTimeEpochMillis), Boolean.valueOf(this.mIsRead));
    }

    public boolean isRead() {
        return this.mIsRead;
    }

    public CarMessage(vc1 vc1Var) {
        throw null;
    }
}
