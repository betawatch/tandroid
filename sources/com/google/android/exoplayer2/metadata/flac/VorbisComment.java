package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;

/* loaded from: classes.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new Parcelable.Creator() { // from class: com.google.android.exoplayer2.metadata.flac.VorbisComment.1
        @Override // android.os.Parcelable.Creator
        public VorbisComment createFromParcel(Parcel parcel) {
            return new VorbisComment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public VorbisComment[] newArray(int i) {
            return new VorbisComment[i];
        }
    };
    public final String key;
    public final String value;

    /* JADX INFO: Access modifiers changed from: protected */
    public VorbisComment(Parcel parcel) {
        this.key = (String) Util.castNonNull(parcel.readString());
        this.value = (String) Util.castNonNull(parcel.readString());
    }

    public VorbisComment(String str, String str2) {
        this.key = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        return this.key.equals(vorbisComment.key) && this.value.equals(vorbisComment.value);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return Metadata.Entry.-CC.$default$getWrappedMetadataBytes(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ Format getWrappedMetadataFormat() {
        return Metadata.Entry.-CC.$default$getWrappedMetadataFormat(this);
    }

    public int hashCode() {
        return ((this.key.hashCode() + 527) * 31) + this.value.hashCode();
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public void populateMediaMetadata(MediaMetadata.Builder builder) {
        String str = this.key;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                builder.setAlbumTitle(this.value);
                return;
            case 1:
                builder.setTitle(this.value);
                return;
            case 2:
                builder.setDescription(this.value);
                return;
            case 3:
                builder.setAlbumArtist(this.value);
                return;
            case 4:
                builder.setArtist(this.value);
                return;
            default:
                return;
        }
    }

    public String toString() {
        return "VC: " + this.key + "=" + this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
