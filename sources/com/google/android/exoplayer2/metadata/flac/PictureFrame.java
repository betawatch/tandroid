package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import d5.z;
import h3.g1;
import h3.t0;
import java.util.Arrays;
import o8.d;
import w.a;
import z3.b;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class PictureFrame implements b {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a(23);
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

    public static PictureFrame fromPictureBlock(z zVar) {
        int e9 = zVar.e();
        String p6 = zVar.p(zVar.e(), d.a);
        String p9 = zVar.p(zVar.e(), d.c);
        int e10 = zVar.e();
        int e11 = zVar.e();
        int e12 = zVar.e();
        int e13 = zVar.e();
        int e14 = zVar.e();
        byte[] bArr = new byte[e14];
        zVar.c(0, e14, bArr);
        return new PictureFrame(e9, p6, p9, e10, e11, e12, e13, bArr);
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

    @Override // z3.b
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return null;
    }

    @Override // z3.b
    public /* bridge */ /* synthetic */ t0 getWrappedMetadataFormat() {
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.pictureData) + ((((((((i0.a.g(i0.a.g((527 + this.pictureType) * 31, 31, this.mimeType), 31, this.description) + this.width) * 31) + this.height) * 31) + this.depth) * 31) + this.colors) * 31);
    }

    @Override // z3.b
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
        int i10 = g0.a;
        this.mimeType = readString;
        this.description = parcel.readString();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.depth = parcel.readInt();
        this.colors = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }
}
