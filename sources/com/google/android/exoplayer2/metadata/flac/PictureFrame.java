package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import b4.b;
import d6.d;
import f5.d0;
import f5.w;
import j3.g1;
import j3.t0;
import j7.l1;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class PictureFrame implements b {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new d(14);
    public final int colors;
    public final int depth;
    public final String description;
    public final int height;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;
    public final int width;

    public PictureFrame(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.pictureType = i10;
        this.mimeType = str;
        this.description = str2;
        this.width = i11;
        this.height = i12;
        this.depth = i13;
        this.colors = i14;
        this.pictureData = bArr;
    }

    public static PictureFrame fromPictureBlock(w wVar) {
        int e10 = wVar.e();
        String p10 = wVar.p(wVar.e(), p8.d.a);
        String p11 = wVar.p(wVar.e(), p8.d.c);
        int e11 = wVar.e();
        int e12 = wVar.e();
        int e13 = wVar.e();
        int e14 = wVar.e();
        int e15 = wVar.e();
        byte[] bArr = new byte[e15];
        wVar.c(0, e15, bArr);
        return new PictureFrame(e10, p10, p11, e11, e12, e13, e14, bArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && PictureFrame.class == obj.getClass()) {
            PictureFrame pictureFrame = (PictureFrame) obj;
            if (this.pictureType == pictureFrame.pictureType && this.mimeType.equals(pictureFrame.mimeType) && this.description.equals(pictureFrame.description) && this.width == pictureFrame.width && this.height == pictureFrame.height && this.depth == pictureFrame.depth && this.colors == pictureFrame.colors && Arrays.equals(this.pictureData, pictureFrame.pictureData)) {
                return true;
            }
        }
        return false;
    }

    @Override // b4.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // b4.b
    public /* bridge */ /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.pictureData) + ((((((((l1.f(l1.f((527 + this.pictureType) * 31, 31, this.mimeType), 31, this.description) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    @Override // b4.b
    public void populateMediaMetadata(g1 g1Var) {
        g1Var.a(this.pictureType, this.pictureData);
    }

    public String toString() {
        return "Picture: mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.pictureType);
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeInt(this.depth);
        parcel.writeInt(this.colors);
        parcel.writeByteArray(this.pictureData);
    }

    public PictureFrame(Parcel parcel) {
        this.pictureType = parcel.readInt();
        String readString = parcel.readString();
        int i10 = d0.a;
        this.mimeType = readString;
        this.description = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }
}
