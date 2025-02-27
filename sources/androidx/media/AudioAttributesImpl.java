package androidx.media;

import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes.dex */
public interface AudioAttributesImpl extends VersionedParcelable {

    public interface Builder {
        AudioAttributesImpl build();

        Builder setLegacyStreamType(int i);
    }
}
